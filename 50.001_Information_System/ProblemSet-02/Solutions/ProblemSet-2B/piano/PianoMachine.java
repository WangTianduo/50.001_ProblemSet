package piano;

import javax.sound.midi.MidiUnavailableException;

import midi.Instrument;
import midi.Midi;
import music.NoteEvent;
import music.Pitch;

import java.util.ArrayList;

public class PianoMachine {
	
	private Midi midi;
	private Instrument instrument;
	private static int instrumentNo;
    private static Instrument[] instrumentSet = new Instrument[0];
    private static ArrayList<NoteEvent> noteEventSet = new ArrayList<>();

    private int octave;
    private static final int MAX_OCTAVE_SHIFT = 2;
    private static final int SEMI_TONE_SHIFT = 12;

    private boolean startRecording = false;
    private ArrayList<NoteEvent> recordingSet = new ArrayList<>();

	/**
	 * constructor for PianoMachine.
	 * 
	 * initialize midi device and any other state that we're storing.
	 */
    public PianoMachine() {
    	try {
            midi = Midi.getInstance();
            instrumentNo = 0;
            instrumentSet = Instrument.values();
            instrument = instrumentSet[instrumentNo];
            octave = 0;
        } catch (MidiUnavailableException e1) {
            System.err.println("Could not initialize midi device");
            e1.printStackTrace();
            return;
        }
    }

    public void beginNote(Pitch rawPitch) {
        beginNote(rawPitch, this.instrument);
    }

    public void beginNote(Pitch rawPitch, Instrument instrument) {
        NoteEvent currentNote = new NoteEvent(rawPitch, System.currentTimeMillis(),instrument, NoteEvent.Kind.start);

        for (NoteEvent note: noteEventSet) {
            if (note.getInstr() == instrument &&
                    note.getPitch().toMidiFrequency() == rawPitch.toMidiFrequency()) {
                return;
            }
        }
        midi.beginNote(rawPitch.transpose(octave * SEMI_TONE_SHIFT).toMidiFrequency(), instrument);
        noteEventSet.add(currentNote);

        if (startRecording) {
            recordingSet.add(currentNote);
        }
    }

    public void endNote(Pitch rawPitch) {
        endNote(rawPitch, this.instrument);
    }

    public void endNote(Pitch rawPitch, Instrument instrument) {
        NoteEvent currentNote = new NoteEvent(rawPitch, System.currentTimeMillis(), instrument, NoteEvent.Kind.stop);
        for (NoteEvent note: noteEventSet) {
            if (note.getInstr() == instrument &&
                    note.getPitch().toMidiFrequency() == rawPitch.toMidiFrequency()) {
                midi.endNote(rawPitch.transpose(octave * SEMI_TONE_SHIFT).toMidiFrequency(), instrument);
                noteEventSet.remove(note);
                break;
            }
        }
        if (startRecording) {
            recordingSet.add(currentNote);
        }
    }

    public void changeInstrument() {
        instrumentNo = (instrumentNo + 1) % instrumentSet.length;
        instrument = instrumentSet[instrumentNo];

    }

    public void shiftUp() {
        if (this.octave < MAX_OCTAVE_SHIFT) {
            this.octave++;
        }
    }

    public void shiftDown() {
        if (this.octave > -MAX_OCTAVE_SHIFT) {
            this.octave--;
        }
    }

    public boolean toggleRecording() {
        this.startRecording = !this.startRecording;
        return this.startRecording;
    }

    public void playback() {
        NoteEvent lastEvent = new NoteEvent(new Pitch(0), 0, instrument, NoteEvent.Kind.start);
        for(int i=0; i<recordingSet.size()-1; i++){
            NoteEvent event = recordingSet.get(i);
            NoteEvent nextEvent = recordingSet.get(i+1);
            lastEvent = nextEvent;
            long waitInterval = (nextEvent.getTime() - event.getTime())/10;
            int waitTime = (int)waitInterval;
            playNoteEvent(event, waitTime);
        }
        playNoteEvent(lastEvent, -1);
        recordingSet.clear();
    }

    private void playNoteEvent(NoteEvent note, int timeInterval) {

        if (note.getKind() == NoteEvent.Kind.start) {
            beginNote(note.getPitch(), note.getInstr());
        }else{
            endNote(note.getPitch(), note.getInstr());
        }

        if (timeInterval == -1) {
            return;
        }else{
            midi.rest(timeInterval);
        }
    }

}

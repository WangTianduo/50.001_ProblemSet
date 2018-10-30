import java.util.Arrays;

public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;  // no of element stored
    private String[] data = new String[INIT_CAPACITY]; // where the element stored

    public SmartArrayList() {

    }

    public void add(int index, String s) {
        // check 0<= index <= size
        // when index == size, append to the end
        // TODO: IMPLEMENT THE METHOD
        if (index >= 0 && index < data.length) {

            if (size < data.length ) { // not point to the last room yet
                if (index != data.length - 1) {
                    String[] oneLarger = new String[data.length + 1];
                    for (int i = 0; i < index; i++) {
                        oneLarger[i] = data[i];
                    }
                    oneLarger[index] = s;
                    for (int i = index; i < data.length; i++) {
                        oneLarger[i + 1] = data[i];
                    }

                    data = oneLarger;
                }else {
                    data[index] = s;
                }
            } else {
                String[] newData = new String[data.length * 2];
                for (int i = 0; i < index; i++) {
                    newData[i] = data[i];
                }
                newData[index] = s;
                for (int i = index; i < data.length; i++) {
                    newData[i+1] = data[i];
                }
                data = newData;
            }

            size++;


        }else {
            return;
        }


    }

    public void add(String s) {
        // TODO: IMPLEMENT THE METHOD
        if (size < data.length) {
            data[size++] = s;
        }else {
            String[] doubleString = new String[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                doubleString[i] = data[i];
            }
            doubleString[size++] = s;
            data = doubleString;
        }

    }

    public String get(int index) {
        // TODO: IMPLEMENT THE METHOD

        if (index >= 0 && index <= size) {
            return data[index];
        }else {
            return null;
        }


    }

    public void set(int index, String s){
        // TODO: IMPLEMENT THE METHOD
        if (index >= 0 && index <= data.length - 1) {
            data[index] = s;
        }else {
            return;
        }

    }

    public void remove(int index) {
        // TODO: IMPLEMENT THE METHOD
        if (index >= 0 && index <= size - 1) {
            String[] shorterByOne = new String[data.length];
            for (int i = 0; i < index; i++) {
                shorterByOne[i] = data[i];
            }
            for (int i = index; i < size - 1; i++) {
                shorterByOne[i] = data[i + 1];
            }
            size --;
            data = shorterByOne;
        }else {
            return;
        }

    }

    @Override
    public String toString(){
        // TODO: IMPLEMENT THE METHOD
        String[] output = new String[size];
        for (int i = 0; i < size; i++) {
            output[i] = data[i];
        }
        return Arrays.toString(output);

    }


}

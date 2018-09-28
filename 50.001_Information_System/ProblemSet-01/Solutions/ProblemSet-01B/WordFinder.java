//package piwords;

import java.util.HashMap;
import java.util.Map;

public class WordFinder {
    /**
     * Given a String (the haystack) and an array of Strings (the needles),
     * return a Map<String, Integer>, where keys in the map correspond to
     * elements of needles that were found as substrings of haystack, and the
     * value for each key is the lowest index of haystack at which that needle
     * was found. A needle that was not found in the haystack should not be
     * returned in the output map.
     *
     * @param haystack The string to search into.
     * @param needles The array of strings to search for. This array is not
     *                mutated.
     * @return The list of needles that were found in the haystack.
     */
    public static Map<String, Integer> getSubstrings(String haystack,
                                                     String[] needles) {
        // TODO: Implement (Problem e)

        HashMap<String, Integer> output = new HashMap<String, Integer>();

        if (needles.length == 0) return null;
        
        int wordLength = 0;
        
        for (String s: needles) {
          int result = match(s, haystack);
          if (result != -1) {
            output.put(s, result);
          }
        }
        return output;
    }

    public static int match(String subString, String longString) {

		int length = longString.length();
		int wordLength = subString.length();
		int match = -1;

		for (int i = 0; i < length - wordLength + 1; i++) {

			if (subString.charAt(0) == longString.charAt(i)) {

				for (int j = 0; j < wordLength; j++) {

					if (subString.charAt(j) == longString.charAt(i+j)) {
						if (j == wordLength - 1) {
							match = i;
						}
					}else{
						break;
					}
				}
			}

		}
		return match;
	}
}

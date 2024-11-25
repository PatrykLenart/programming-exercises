package exercises.leetCode.longestSubstringWithoutRepeatingCharacterse3M;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int getLengthOfLongestSubstring(String s) {
        String[] characters = s.split("");
        Map<String, Integer> occurrences = new HashMap<>();
        int stringLength = s.length();
        int longestSubstringSize = 0;

        for (int i = 0; i < stringLength; i++) {
            for (int j = i; j < stringLength; j++) {
                String character = characters[j];
                if (!occurrences.containsKey(character)) {
                    occurrences.put(character, 1);
                    longestSubstringSize = longestSubstringSize == 0 ? 1 : longestSubstringSize;
                } else {
                    int currentSize = occurrences.size();
                    if(currentSize > longestSubstringSize)
                        longestSubstringSize  = currentSize;
                    occurrences.clear();
                    break;
                }
            }

        }
        return longestSubstringSize;
    }
}

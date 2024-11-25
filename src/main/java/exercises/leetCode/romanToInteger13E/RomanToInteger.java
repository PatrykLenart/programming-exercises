package exercises.leetCode.romanToInteger13E;

public class RomanToInteger {

    public static int romanToIntInitialIdea(String s) {

        String[] characters = s.split("");
        int sum = 0;

        int previous = 0;
        for (int i = 0; i < s.length(); i++) {
            int convertedValue = RomanNumerals.valueOf(characters[i]).value;
            if (previous != 0) {
                if (previous >= convertedValue) {
                    sum += previous;
                } else {
                    sum -= previous;
                }
            }
            previous = convertedValue;
        }

        return sum + RomanNumerals.valueOf(characters[s.length()-1]).value;
    }
}
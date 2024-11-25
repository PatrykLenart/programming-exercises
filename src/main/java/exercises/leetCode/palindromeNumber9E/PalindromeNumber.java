package exercises.leetCode.palindromeNumber9E;

public class PalindromeNumber {

    public static boolean isPalindromeWithoutStringConversion(int x){
        int reverseNum = 0;
        int reverse = x;

        while(reverse > 0){
            reverseNum = (reverseNum*10) + reverse%10;
            reverse = reverse/10;
        }

        return x == reverseNum;
    }

    public static boolean isPalindromeInitialAttempt(int x) {
        String s = String.valueOf(x);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if(s.charAt(i) != s.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
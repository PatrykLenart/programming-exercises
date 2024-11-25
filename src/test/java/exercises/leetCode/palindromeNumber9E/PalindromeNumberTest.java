package exercises.leetCode.palindromeNumber9E;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    //private final [interface] with @FunctionalInterface [name] = [class]::[method]
    private final PalindromeChecker isPalindromeMethod = PalindromeNumber::isPalindromeWithoutStringConversion;

    @Test
    public void numberIsPalindromeThreeDigits() {
        //Given
        int x = 121;
        //When//Then
        assertTrue(isPalindromeMethod.isPalindrome(x));
    }


    @Test
    public void numberNotPalindromeThreeDigitsAndNonDigitCharacter() {
        //Given
        int x = -121;
        //When//Then
        assertFalse(isPalindromeMethod.isPalindrome(x));
    }

    @Test
    public void numberNotPalindromeTwoDigits() {
        //Given
        int x = 10;
        //When//Then
        assertFalse(isPalindromeMethod.isPalindrome(x));
    }

    @Test
    public void numberNotPalindromeMaxDigits() {
        //Given
        int x = 2147483647;
        //When//Then
        assertFalse(isPalindromeMethod.isPalindrome(x));
    }

    @Test
    public void numberIsPalindromeMaxDigits() {
        //Given
        int x = 2147447412;
        //When//Then
        assertTrue(isPalindromeMethod.isPalindrome(x));
    }

    @Test
    public void numberIsPalindromeZero() {
        //Given
        int x = 0;
        //When//Then
        assertTrue(isPalindromeMethod.isPalindrome(x));
    }

    @Test
    public void numberIsPalindromeOneDigit() {
        //Given
        int x = 9;
        //When//Then
        assertTrue(isPalindromeMethod.isPalindrome(x));
    }
}
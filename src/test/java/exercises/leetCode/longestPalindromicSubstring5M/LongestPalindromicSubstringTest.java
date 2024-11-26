package exercises.leetCode.longestPalindromicSubstring5M;

import org.junit.jupiter.api.Test;

import static exercises.leetCode.longestPalindromicSubstring5M.LongestPalindromicSubstring.longestPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    public void oneCharacterString(){
        //Given
        String s = "a";
        //When
        String longestPalindrome = longestPalindrome(s);
        //Then
        assertEquals("a", longestPalindrome);
    }

    @Test
    public void sameCharacterString(){
        //Given
        String s = "bbbbb";
        //When
        String longestPalindrome = longestPalindrome(s);
        //Then
        assertEquals("bbbbb", longestPalindrome);
    }
    @Test
    public void wholeStringIsPalindrome(){
        //Given
        String s = "abcba";
        //When
        String longestPalindrome = longestPalindrome(s);
        //Then
        assertEquals("abcba", longestPalindrome);
    }
    @Test
    public void palindromeStringAtTheFront(){
        //Given
        String s = "abacc";
        //When
        String longestPalindrome = longestPalindrome(s);
        //Then
        assertEquals("aba", longestPalindrome);
    }
    @Test
    public void palindromeStringAtTheEnd(){
        //Given
        String s = "ccaba";
        //When
        String longestPalindrome = longestPalindrome(s);
        //Then
        assertEquals("aba", longestPalindrome);
    }

    @Test
    public void palindromeWithTwoPossibleAnswers(){
        //Given
        String s = "babad";
        //When
        String longestPalindrome = longestPalindrome(s);
        //Then
        assertTrue(
                longestPalindrome.equals("bab") || longestPalindrome.equals("aba"),
                "The result can be either 'bab' or 'aba'."
        );
    }

}
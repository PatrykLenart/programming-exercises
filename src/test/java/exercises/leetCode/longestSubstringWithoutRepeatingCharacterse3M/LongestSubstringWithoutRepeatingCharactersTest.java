package exercises.leetCode.longestSubstringWithoutRepeatingCharacterse3M;

import org.junit.jupiter.api.Test;

import static exercises.leetCode.longestSubstringWithoutRepeatingCharacterse3M.LongestSubstringWithoutRepeatingCharacters.getLengthOfLongestSubstring;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void sameCharacterString(){
        //Given
        String s = "bbbbb";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(1, lengthOfLongestSubstring);
    }

    @Test
    public void wholeStringIsLongest(){
        //Given
        String s = "abcde";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(5, lengthOfLongestSubstring);
    }

    @Test
    public void emptyString(){
        //Given
        String s = "";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(0, lengthOfLongestSubstring);
    }

    @Test
    public void substringIsAtTheEnd(){
        //Given
        String s = "xyxyabc";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(5, lengthOfLongestSubstring);
    }

    @Test
    public void substringIsAtTheStart(){
        //Given
        String s = "abcxyxy";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(5, lengthOfLongestSubstring);
    }

    @Test
    public void substringIsNotASubsequence(){
        //Given
        String s = "pwwkew";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(3, lengthOfLongestSubstring);
    }

    @Test
    public void substringIsSpacebar(){
        //Given
        String s = " ";
        //When
        int lengthOfLongestSubstring = getLengthOfLongestSubstring(s);
        //Then
        assertEquals(1, lengthOfLongestSubstring);
    }

}
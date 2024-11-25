package exercises.leetCode.romanToInteger13E;

import org.junit.jupiter.api.Test;

import static exercises.leetCode.romanToInteger13E.RomanToInteger.romanToIntInitialIdea;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    public void sameCharacterRomanNumeral(){
        //Given
        String s = "III";
        //When
        int result = romanToIntInitialIdea(s);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void pureAdditionRomanNumeral(){
        //Given
        String s = "LVIII";
        //When
        int result = romanToIntInitialIdea(s);
        //Then
        assertEquals(58, result);
    }

    @Test
    public void subtractionRomanNumeral(){
        //Given
        String s = "MCMXCIV";
        //When
        int result = romanToIntInitialIdea(s);
        //Then
        assertEquals(1994, result);
    }
}
package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void nonLetterAfterNonMatchingLetter() {
        int words = new CountLetters().count("dog|");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void letterAfterMatchingLetter() {
        int words = new CountLetters().count("cars");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void emptyStringReturnsZero() {
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void lastCharIsX() {
        int words = new CountLetters().count("ajax");
        Assertions.assertEquals(1, words);
    }
}

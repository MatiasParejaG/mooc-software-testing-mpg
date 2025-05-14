package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    @Test
    void testMirrorAtBothEnds() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    void testSingleCharacterMirror() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    void testFullMirrorOddLength() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    void testFullMirrorEvenLength() {
        Mirror mirror = new Mirror();
        assertEquals("abba", mirror.mirrorEnds("abba"));
    }

    @Test
    void testNoMirror() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("abcd"));
    }

    @Test
    void testEmptyString() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    void testSingleCharacterString() {
        Mirror mirror = new Mirror();
        assertEquals("x", mirror.mirrorEnds("x"));
    }
}
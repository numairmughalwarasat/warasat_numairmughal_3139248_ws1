package griffith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WordTest {

    @Test
    void testContains() {
        // Test case 1: Check if the word contains a letter from the word
        Words word1 = new Words(new char[]{'a', 'b', 'c', 'd'});
        assertTrue(word1.contains('a'));  // 'a' is present in the word

        // Test case 2: Check if the word does not contain a letter not in the word
        Words word2 = new Words(new char[]{'e', 'f', 'g', 'h'});
        assertFalse(word2.contains('z'));  // 'z' is not present in the word

        // Test case 3: Check if the word contains a special character
        Words word3 = new Words(new char[]{'1', '@', '#', '$'});
        assertTrue(word3.contains('@'));  // '@' is present in the word
    }

    @Test
    void testLength() {
        // Test case 1: Word with multiple characters
        Words word1 = new Words(new char[]{'a', 'b', 'c', 'd'});
        assertEquals(4, word1.length());  // The length should be 4

        // Test case 2: Empty word (no characters)
        Words word2 = new Words(new char[]{});
        assertEquals(0, word2.length());  // The length should be 0

        // Test case 3: Word with one character
        Words word3 = new Words(new char[]{'a'});
        assertEquals(1, word3.length());  // The length should be 1
    }

    @Test
    void testNotNull() {
        // Test case 1: Check if the word object is not null
        Words word1 = new Words(new char[]{'a', 'b', 'c', 'd'});
        assertNotNull(word1);  // The word object should not be null

        // Test case 2: Check if the word object is not null for another word
        Words word2 = new Words(new char[]{'x', 'y', 'z'});
        assertNotNull(word2);  // The word object should not be null

        // Test case 3: Check if the word object is not null for an empty word
        Words word3 = new Words(new char[]{});
        assertNotNull(word3);  // The word object should not be null
    }
}

package griffith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WordTest {

    @Test
    void testContains() {
        // Create a Word object to test the contains method
        Words word = new Words(new char[]{'a', 'b', 'c', 'd'});

        // Test if the word contains certain letters
        assertTrue(word.contains('a'));
        assertFalse(word.contains('e'));
    }

    @Test
    void testLength() {
        // Create a Word object to test the length method
        Words word = new Words(new char[]{'a', 'b', 'c', 'd'});

        // Test the length of the word
        assertEquals(4, word.length());
    }

    @Test
    void testNotNull() {
        // Create a Word object to test if it is not null
        Words word = new Words(new char[]{'a', 'b', 'c', 'd'});

        // Test if the word object is not null
        assertNotNull(word);
    }
}

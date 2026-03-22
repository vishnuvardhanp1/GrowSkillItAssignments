/**
 * 
 */
package assignments.tests;

/**
 * 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import assignments.AsciiExplorer;

public class AsciiExplorerTest {

    @Test
    void testGetAsciiValue() {
        assertEquals(65, AsciiExplorer.getAsciiValue('A'));
    }

    @Test
    void testAddFiveToAscii() {
        assertEquals(70, AsciiExplorer.addFiveToAscii(65));
    }

    @Test
    void testConvertToChar() {
        assertEquals('F', AsciiExplorer.convertToChar(70));
    }

    @Test
    void testFullFlow() {
        char input = 'A';
        int ascii = AsciiExplorer.getAsciiValue(input);
        int updated = AsciiExplorer.addFiveToAscii(ascii);
        char result = AsciiExplorer.convertToChar(updated);

        assertEquals('F', result);
    }
}
/**
 * 
 */
package assignments.tests;
import assignments.WeeklyAssignment2;
/**
 * 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class WeeklyAssignment2Test {

    @Test
    void testGetAsciiValue() {
        assertEquals(65, WeeklyAssignment2.getAsciiValue('A'));
    }

    @Test
    void testAddFiveToAscii() {
        assertEquals(70, WeeklyAssignment2.addFiveToAscii(65));
    }

    @Test
    void testConvertToChar() {
        assertEquals('F', WeeklyAssignment2.convertToChar(70));
    }

    @Test
    void testFullFlow() {
        char input = 'A';
        int ascii = WeeklyAssignment2.getAsciiValue(input);
        int updated = WeeklyAssignment2.addFiveToAscii(ascii);
        char result = WeeklyAssignment2.convertToChar(updated);

        assertEquals('F', result);
    }
}
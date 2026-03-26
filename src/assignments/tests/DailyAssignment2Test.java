/**
 * 
 */
package assignments.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import assignments.DailyAssignment2;

public class DailyAssignment2Test {

    private DailyAssignment2 obj;

    @BeforeEach
    void setUp() {
        obj = new DailyAssignment2();
    }

    @Test
    void testGetMarks() {
        assertEquals(97.8F, obj.getMarks());
    }

    @Ignore
    void testConvertToDouble() {
        double result = obj.convertToDouble(97.8F);
        assertEquals(97.8, result);
    }

    @Test
    void testConvertToInt() {
        int result = obj.convertToInt(97.8F);
        assertEquals(97, result); // decimal removed
    }

    @Test
    void testConvertToChar() {
        char result = obj.convertToChar(97);
        assertEquals('a', result); // ASCII 97 = 'a'
    }
}

/**
 * 
 */
package assignments.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import assignments.WeeklyAssignment1;

public class WeeklyAssigment1Test {

   @Ignore
    void testFloatToDouble() {
        float input = 87.6F;
        double result = WeeklyAssignment1.convertFloatToDouble(input);
        assertEquals(87.6, result);
    } 

    @Test
    void testDoubleToInt() {
        double input = 87.6;
        int result = WeeklyAssignment1.convertDoubleToInt(input);
        assertEquals(87, result); // decimal removed
    }

    @Test
    void testIntToChar() {
        int input = 87;
        char result = WeeklyAssignment1.convertIntToChar(input);
        assertEquals('W', result);
    }
}
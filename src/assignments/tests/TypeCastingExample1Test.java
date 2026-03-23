/**
 * 
 */
package assignments.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import assignments.TypeCastingExample1;

public class TypeCastingExample1Test {

   @Ignore
    void testFloatToDouble() {
        float input = 87.6F;
        double result = TypeCastingExample1.convertFloatToDouble(input);
        assertEquals(87.6, result);
    } 

    @Test
    void testDoubleToInt() {
        double input = 87.6;
        int result = TypeCastingExample1.convertDoubleToInt(input);
        assertEquals(87, result); // decimal removed
    }

    @Test
    void testIntToChar() {
        int input = 87;
        char result = TypeCastingExample1.convertIntToChar(input);
        assertEquals('W', result);
    }
}
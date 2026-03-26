/**
 * 
 */
package assignments.tests;

/**
 * 
 */
import org.junit.jupiter.api.Test;

import assignments.DailyAssignment4;

import static org.junit.jupiter.api.Assertions.*;

public class DailyAssignment4Test {

    @Test
    void testFailCondition() {
        String result = DailyAssignment4.getResult(80, 70, 30, 90, 85);
        assertTrue(result.contains("Fail"));
        assertTrue(result.contains("Grade: F"));
    }

    @Test
    void testPassWithAPlus() {
        String result = DailyAssignment4.getResult(95, 92, 96, 94, 93);
        assertTrue(result.contains("Pass"));
        assertTrue(result.contains("Grade: A+"));
    }

    @Test
    void testPassWithA() {
        String result = DailyAssignment4.getResult(80, 78, 76, 75, 77);
        assertTrue(result.contains("Grade: A"));
    }

    @Test
    void testPassWithB() {
        String result = DailyAssignment4.getResult(65, 62, 60, 63, 61);
        assertTrue(result.contains("Grade: B"));
    }

    @Test
    void testPassWithC() {
        String result = DailyAssignment4.getResult(55, 52, 50, 58, 54);
        assertTrue(result.contains("Grade: C"));
    }

    @Test
    void testPassWithD() {
        String result = DailyAssignment4.getResult(40, 45, 35, 38, 42);
        assertTrue(result.contains("Grade: D"));
    }

    @Test
    void testBoundary33Pass() {
        String result = DailyAssignment4.getResult(33, 33, 33, 33, 33);
        assertTrue(result.contains("Pass"));
        assertTrue(result.contains("Grade: D"));
    }

    @Test
    void testBoundaryFailBelow33() {
        String result = DailyAssignment4.getResult(33, 32, 50, 60, 70);
        assertTrue(result.contains("Fail"));
    }
}

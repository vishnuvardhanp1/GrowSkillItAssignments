/**
 * 
 */
package assignments.tests;

/**
 * 
 */
import org.junit.jupiter.api.Test;

import assignments.ResultProgram;

import static org.junit.jupiter.api.Assertions.*;

public class ResultProgramTest {

    @Test
    void testFailCondition() {
        String result = ResultProgram.getResult(45, 67, 32, 78, 90);
        assertEquals("Fail-F", result);
    }

    @Test
    void testPassCondition() {
        String result = ResultProgram.getResult(45, 67, 50, 78, 90);
        assertEquals("Pass", result);
    }

    @Test
    void testAllFail() {
        String result = ResultProgram.getResult(10, 20, 30, 25, 15);
        assertEquals("Fail-F", result);
    }

    @Test
    void testBoundaryCondition() {
        String result = ResultProgram.getResult(33, 33, 33, 33, 33);
        assertEquals("Pass", result);
    }
}

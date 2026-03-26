package assignments.tests;

import org.junit.jupiter.api.Test;

import assignments.DailyAssignment5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class DailyAssigment5Test {

    @Test
    void testOutput() {

        // Capture console output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(output));

        // Call your method
        DailyAssignment5.getValues();

        // Restore original System.out
        System.setOut(original);

        String result = output.toString();

        // Assertions
        assertTrue(result.contains("1"));
        assertTrue(result.contains("8"));    // 2^3
        assertTrue(result.contains("64"));   // 4^3
        assertTrue(result.contains("25"));   // 5*5
        assertTrue(result.contains("100"));  // 10^2
    }
}

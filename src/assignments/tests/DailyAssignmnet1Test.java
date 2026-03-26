/**
 * 
 */
package assignments.tests;

/**
 * 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import assignments.DailyAssignment1;

public class DailyAssignmnet1Test {

    private DailyAssignment1 student;

    @BeforeEach
    void setUp() {
        student = new DailyAssignment1();
    }

    @Test
    void testGetAge() {
        assertEquals(44, student.getAge());
    }

    @Test
    void testGetMarks() {
        assertEquals(450, student.getMarks());
    }

    @Test
    void testGetBatteryPercentage() {
        assertEquals(100, student.getBatteryPercentage());
    }

    @Test
    void testGetCityPopulation() {
        assertEquals(2500000, student.getCityPopulation());
    }

    @Test
    void testGetGrade() {
        assertEquals('A', student.getGrade());
    }

    @Test
    void testGetBankBalance() {
        assertEquals(5000000, student.getBankBalance());
    }

    @Test
    void testIsUserLoggedIn() {
        assertTrue(student.isUserLoggedIn());
    }

    @Test
    void testGetDistanceToCollege() {
        assertEquals(1200, student.getDistanceToCollege());
    }

    @Test
    void testGetLargeNumber() {
        assertEquals(9000000000L, student.getLargeNumber());
    }
}

package assignments.tests;

import org.junit.jupiter.api.Test;

import assignments.DailyAssignment6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;

public class DailyAssignment6Test {

    @Test
    void testValidArmstrongNumber() {
        assertTrue(DailyAssignment6.isArmstrong(153));
    }

    @Test
    void testMoreArmstrongNumbers() {
        assertTrue(DailyAssignment6.isArmstrong(370));
        assertTrue(DailyAssignment6.isArmstrong(371));
        assertTrue(DailyAssignment6.isArmstrong(407));
    }

    @Test
    void testNonArmstrongNumbers() {
        assertFalse(DailyAssignment6.isArmstrong(123));
        assertFalse(DailyAssignment6.isArmstrong(100));
    }

    @Ignore
    void testSingleDigitNumbers() {
        assertTrue(DailyAssignment6.isArmstrong(0));
        assertTrue(DailyAssignment6.isArmstrong(5));
        assertTrue(DailyAssignment6.isArmstrong(9));
    }

    @Test
    void testEdgeCases() {
        assertFalse(DailyAssignment6.isArmstrong(10));
        assertFalse(DailyAssignment6.isArmstrong(99));
    }
}

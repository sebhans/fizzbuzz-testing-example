package eu.bbv.fizzbuzz.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoesTest {
    @ParameterizedTest
    @CsvSource({"1, 1", "1, 2", "1, 3", "1, 0", "3, 3", "3, 6", "3, 15", "5, 5", "5, 10", "5, 15"})
    void recognizesPossibleDivisions(int divisor, int number) {
        assertTrue(new Does().divide(divisor, number));
    }

    @ParameterizedTest
    @CsvSource({"3, 1", "3, 5", "3, 10", "5, 1", "5, 3", "5, 12"})
    void recognizesImpossibleDivisions(int divisor, int number) {
        assertFalse(new Does().divide(divisor, number));
    }

    @Test
    void throwsOnDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> new Does().divide(0, 1));
    }
}
package eu.bbv.fizzbuzz.output;

import org.junit.jupiter.api.Test;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.BUZZ;
import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.FIZZ;
import static org.junit.jupiter.api.Assertions.*;

class CombinedOutputTest {
    @Test
    void rendersEmptyList() {
        assertEquals("", new CombinedOutput().render());
    }

    @Test
    void rendersSingleOutput() {
        assertEquals("Fizz", new CombinedOutput(FIZZ).render());
    }

    @Test
    void rendersCombinedOutput() {
        assertEquals("FizzBuzz", new CombinedOutput(FIZZ, BUZZ).render());
    }
}
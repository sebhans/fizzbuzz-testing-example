package eu.bbv.fizzbuzz.output;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOutputTest {
    @Test
    void rendersNumber() {
        assertEquals("5", new NumberOutput(5).render());
    }
}
package eu.bbv.fizzbuzz.output;

import org.junit.jupiter.api.Test;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.*;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzOutputTest {
    @Test
    void rendersFizz() {
        assertEquals("Fizz", FIZZ.render());
    }

    @Test
    void rendersBuzz() {
        assertEquals("Buzz", BUZZ.render());
    }

    @Test
    void rendersFizzBuzz() {
        assertEquals("FizzBuzz", FIZZBUZZ.render());
    }
}
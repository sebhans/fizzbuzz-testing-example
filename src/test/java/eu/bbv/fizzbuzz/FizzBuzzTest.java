package eu.bbv.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void oneIs1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.go(1);

        assertEquals("1", result.getFirst());
    }

    @Test
    void threeIsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.go(3);

        assertEquals("Fizz", result.getLast());
    }

    @Test
    void fiveIsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.go(5);

        assertEquals("Buzz", result.getLast());
    }

    @Test
    void fifteenIsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.go(15);

        assertEquals("FizzBuzz", result.getLast());
    }
}
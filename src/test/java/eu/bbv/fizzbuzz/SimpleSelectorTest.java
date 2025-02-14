package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.math.Does;
import eu.bbv.fizzbuzz.output.NumberOutput;
import org.junit.jupiter.api.Test;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.*;
import static org.assertj.core.api.Assertions.assertThat;

class SimpleSelectorTest {
    private final SimpleSelector selector = new SimpleSelector(new Does());

    @Test
    void oneIs1() {
        assertThat(selector.select(1)).isEqualTo(new NumberOutput(1));
    }

    @Test
    void threeIsFizz() {
        assertThat(selector.select(3)).isEqualTo(FIZZ);
    }

    @Test
    void fiveIsBuzz() {
        assertThat(selector.select(5)).isEqualTo(BUZZ);
    }

    @Test
    void fifteenIsFizzBuzz() {
        assertThat(selector.select(15)).isEqualTo(FIZZBUZZ);
    }
}
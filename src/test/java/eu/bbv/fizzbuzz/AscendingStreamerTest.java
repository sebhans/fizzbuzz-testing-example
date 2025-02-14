package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.math.Does;
import eu.bbv.fizzbuzz.output.CombinedOutput;
import eu.bbv.fizzbuzz.output.NumberOutput;
import org.junit.jupiter.api.Test;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.*;
import static org.assertj.core.api.Assertions.assertThat;

class AscendingStreamerTest {
    @Test
    void returnsSelectedOutputsInOrder() {
        var streamer = new AscendingStreamer(new SimpleSelector(new Does()));

        var stream = streamer.go(15);

        assertThat(stream).containsExactly(
            n(1), n(2), FIZZ, n(4), BUZZ, FIZZ, n(7), n(8), FIZZ, BUZZ, n(11), FIZZ, n(13), n(14), new CombinedOutput(FIZZ, BUZZ)
        );
    }

    private NumberOutput n(int n) { return new NumberOutput(n); }
}
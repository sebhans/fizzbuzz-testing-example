package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.output.NumberOutput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.FIZZ;
import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.FIZZBUZZ;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FizzBuzzTest {
    @Mock
    private Streamer streamer;

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz(streamer);
    }

    @Test
    void aggregates() {
        when(streamer.go(1)).thenReturn(Stream.of(new NumberOutput(1), new NumberOutput(2), FIZZ));
        assertThat(fizzBuzz.go(1)).containsExactly("1", "2", "Fizz");
    }

    @Test
    void shoutsFIZZBUZZ() {
        when(streamer.go(1)).thenReturn(Stream.of(FIZZBUZZ));
        assertThat(fizzBuzz.go(1)).containsExactly("FIZZBUZZ");
    }
}
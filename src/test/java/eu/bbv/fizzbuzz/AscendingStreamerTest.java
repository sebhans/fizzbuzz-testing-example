package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.output.NumberOutput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.FIZZ;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AscendingStreamerTest {
    @Mock
    private Selector selector;

    private Streamer streamer;

    @BeforeEach
    void setUp() {
        streamer = new AscendingStreamer(selector);
    }

    @Test
    void returnsSelectedOutputsInOrder() {
        when(selector.select(1)).thenReturn(new NumberOutput(1));
        when(selector.select(2)).thenReturn(new NumberOutput(2));
        when(selector.select(3)).thenReturn(FIZZ);

        var stream = streamer.go(3);

        assertThat(stream).containsExactly(new NumberOutput(1), new NumberOutput(2), FIZZ);
    }
}
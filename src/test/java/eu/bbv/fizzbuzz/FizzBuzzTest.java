package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.math.Does;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FizzBuzzTest {
    @Mock
    private Does does;

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz(new AscendingStreamer(new SimpleSelector(does)));
    }

    @Test
    void aggregates() {
        when(does.divide(3, 1)).thenReturn(false);
        when(does.divide(5, 1)).thenReturn(false);
        when(does.divide(3, 2)).thenReturn(false);
        when(does.divide(5, 2)).thenReturn(false);
        when(does.divide(3, 3)).thenReturn(true);
        when(does.divide(5, 3)).thenReturn(false);

        assertThat(fizzBuzz.go(3)).containsExactly("1", "2", "Fizz");
    }

    @Test
    void shoutsFIZZBUZZ() {
        when(does.divide(3, 1)).thenReturn(true);
        when(does.divide(5, 1)).thenReturn(true);

        assertThat(fizzBuzz.go(1)).containsExactly("FIZZBUZZ");
    }
}
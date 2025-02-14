package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.math.Does;
import eu.bbv.fizzbuzz.output.NumberOutput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SimpleSelectorTest {
    @Mock
    private Does does;

    private SimpleSelector selector;

    @BeforeEach
    void setUp() {
        selector = new SimpleSelector(does);
    }

    @Test
    void modNothingYieldsNumber() {
        when(does.divide(3, 1)).thenReturn(false);
        when(does.divide(5, 1)).thenReturn(false);
        assertThat(selector.select(1)).isEqualTo(new NumberOutput(1));
    }

    @Test
    void mod3YieldsFizz() {
        when(does.divide(3, 1)).thenReturn(true);
        when(does.divide(5, 1)).thenReturn(false);
        assertThat(selector.select(1)).isEqualTo(FIZZ);
    }

    @Test
    void mod5YieldsBuzz() {
        when(does.divide(3, 1)).thenReturn(false);
        when(does.divide(5, 1)).thenReturn(true);
        assertThat(selector.select(1)).isEqualTo(BUZZ);
    }

    @Test
    void mod3AndMod5YieldsFizzBuzz() {
        when(does.divide(3, 1)).thenReturn(true);
        when(does.divide(5, 1)).thenReturn(true);
        assertThat(selector.select(1)).isEqualTo(FIZZBUZZ);
    }
}
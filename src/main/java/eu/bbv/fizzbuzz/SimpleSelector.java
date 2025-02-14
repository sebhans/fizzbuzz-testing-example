package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.math.Does;
import eu.bbv.fizzbuzz.output.CombinedOutput;
import eu.bbv.fizzbuzz.output.NumberOutput;
import eu.bbv.fizzbuzz.output.Output;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.*;

public record SimpleSelector(Does does) implements Selector {
    @Override
    public Output select(int n) {
        if (does.divide(3, n) && does.divide(5, n)) return new CombinedOutput(FIZZ, BUZZ);
        else if (does.divide(3, n)) return FIZZ;
        else if (does.divide(5, n)) return BUZZ;
        else return new NumberOutput(n);
    }
}

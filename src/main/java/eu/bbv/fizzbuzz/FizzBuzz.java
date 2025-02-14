package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.output.CombinedOutput;
import eu.bbv.fizzbuzz.output.Output;

import java.util.List;
import java.util.Set;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.*;

public record FizzBuzz(Streamer streamer) {
    private static final Set<Output> SHOUT_OUTPUTS = Set.of(new CombinedOutput(FIZZ, BUZZ));

    public List<String> go(int n) {
        return streamer.go(n).map((output) -> {
            if (SHOUT_OUTPUTS.contains(output)) return output.render().toUpperCase();
            else return output.render();
        }).toList();
    }
}

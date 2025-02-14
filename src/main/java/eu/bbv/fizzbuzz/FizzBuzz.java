package eu.bbv.fizzbuzz;

import java.util.List;

import static eu.bbv.fizzbuzz.output.FizzBuzzOutput.FIZZBUZZ;

public record FizzBuzz(Streamer streamer) {
    public List<String> go(int n) {
        return streamer.go(n).map((output) -> {
            if (output == FIZZBUZZ) return output.render().toUpperCase();
            else return output.render();
        }).toList();
    }
}

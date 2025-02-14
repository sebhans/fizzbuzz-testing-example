package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.output.Output;

import java.util.stream.Stream;

public interface Streamer {
    Stream<Output> go(int n);
}

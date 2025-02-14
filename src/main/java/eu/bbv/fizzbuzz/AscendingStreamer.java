package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.output.Output;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public record AscendingStreamer(Selector selector) implements Streamer {
    @Override
    public Stream<Output> go(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(selector::select);
    }
}

package eu.bbv.fizzbuzz.output;

import java.util.List;
import java.util.stream.Collectors;

public record CombinedOutput(List<Output> outputs) implements Output {
    public CombinedOutput(Output... outputs) { this(List.of(outputs)); }

    @Override
    public String render() { return outputs.stream().map(Output::render).collect(Collectors.joining("")); }
}

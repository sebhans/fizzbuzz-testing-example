package eu.bbv.fizzbuzz.output;

public record NumberOutput(int number) implements Output {
    @Override
    public String render() { return Integer.toString(number); }
}

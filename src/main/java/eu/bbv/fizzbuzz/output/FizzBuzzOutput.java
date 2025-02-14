package eu.bbv.fizzbuzz.output;

public enum FizzBuzzOutput implements Output {
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZBUZZ("FizzBuzz");

    private final String representation;

    FizzBuzzOutput(String representation) { this.representation = representation; }

    @Override
    public String render() { return representation; }
}

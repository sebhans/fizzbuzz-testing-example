package eu.bbv.fizzbuzz.output;

public sealed interface Output permits CombinedOutput, FizzBuzzOutput, NumberOutput {
    String render();
}

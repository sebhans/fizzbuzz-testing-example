package eu.bbv.fizzbuzz.output;

public sealed interface Output permits FizzBuzzOutput, NumberOutput {
    String render();
}

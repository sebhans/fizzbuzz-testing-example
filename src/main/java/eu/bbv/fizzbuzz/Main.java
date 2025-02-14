package eu.bbv.fizzbuzz;

import eu.bbv.fizzbuzz.math.Does;

public class Main {
    public static void main(String[] args) {
        var fizzBuzz = new FizzBuzz(new AscendingStreamer(new SimpleSelector(new Does())));
        fizzBuzz.go(100).forEach(System.out::println);
    }
}

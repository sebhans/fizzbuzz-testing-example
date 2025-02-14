package eu.bbv.fizzbuzz;

import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> go(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(this::fizzBuzz).toList();
    }

    private String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        else return Integer.toString(n);
    }
}

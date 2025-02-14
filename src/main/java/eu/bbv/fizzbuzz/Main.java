package eu.bbv.fizzbuzz;


public class Main {
    public static void main(String[] args) {
        var fizzBuzz = new FizzBuzz();
        fizzBuzz.go(100).forEach(System.out::println);
    }
}

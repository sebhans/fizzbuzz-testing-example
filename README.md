# FizzBuzz with overlapping tests
This repository contains the code example from my blog post [Unit testing vs. integration testing](https://sebastian-hans.de/blog/unit-testing-vs-integration-testing/).

The branch `main` contains the main example with the modularized implementation.

The branch `combined-output` contains the change with `CombinedOutput`.
Note that the tests succeed, but executing the `main` method does not yield the correct output
(“FizzBuzz” instead of “FIZZBUZZ”).

The branch `overlapping-tests` contains a version without this change, but with overlapping tests.

The branch `combined-output-overlapping-tests` contains the change from `combined-output` as well as the overlapping tests
(which now fail).

The branch `combined-output-overlapping-tests-fixed` adds the fix necessary to make the overlapping tests succeed again.

For completeness' sake, the branch `simple` contains the all-in-one implementation from the beginning of the post.

## Build & execution
Requirement: Java 21.

Build and execute all tests:

```shell
./mvnw package
```

Execute the program:

```shell
java -jar target/fizzbuzz-0.0.1-SNAPSHOT.jar
```

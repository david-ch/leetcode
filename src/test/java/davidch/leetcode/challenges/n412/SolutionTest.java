package davidch.leetcode.challenges.n412;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.fizzBuzz(3);

        assertThat(result).isEqualTo(List.of("1", "2", "Fizz"));
    }

    @Test
    void example_2() {
        final var result = solution.fizzBuzz(5);

        assertThat(result).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz"));
    }

    @Test
    void example_3() {
        final var result = solution.fizzBuzz(15);

        assertThat(result).isEqualTo(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
    }
}
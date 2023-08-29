package davidch.leetcode.challenges.n399;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var equations = List.of(List.of("a", "b"), List.of("b", "c"));
        final double[] values = {2.0, 3.0};
        final var queries = List.of(
                List.of("a", "c"),
                List.of("b", "a"),
                List.of("a", "e"),
                List.of("a", "a"),
                List.of("x", "x")
        );
        final double[] expectedResult = {6.00000, 0.50000, -1.00000, 1.00000, -1.00000};

        final var result = solution.calcEquation(equations, values, queries);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var equations = List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
        final double[] values = {1.5, 2.5, 5.0};
        final var queries = List.of(
                List.of("a", "c"),
                List.of("c", "b"),
                List.of("bc", "cd"),
                List.of("cd", "bc")
        );
        final double[] expectedResult = {3.75000, 0.40000, 5.00000, 0.20000};

        final var result = solution.calcEquation(equations, values, queries);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final var equations = List.of(List.of("a", "b"));
        final double[] values = {0.5};
        final var queries = List.of(
                List.of("a", "b"),
                List.of("b", "a"),
                List.of("a", "c"),
                List.of("x", "y")
        );
        final double[] expectedResult = {0.50000, 2.00000, -1.00000, -1.00000};

        final var result = solution.calcEquation(equations, values, queries);
        assertThat(result).isEqualTo(expectedResult);
    }
}
package davidch.leetcode.challenges.n739;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        final int[] expectedResult = {1, 1, 4, 2, 1, 1, 0, 0};
        final var result = solution.dailyTemperatures(temperatures);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] temperatures = {30, 40, 50, 60};
        final int[] expectedResult = {1, 1, 1, 0};
        final var result = solution.dailyTemperatures(temperatures);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] temperatures = {30, 60, 90};
        final int[] expectedResult = {1, 1, 0};
        final var result = solution.dailyTemperatures(temperatures);
        assertThat(result).isEqualTo(expectedResult);
    }
}
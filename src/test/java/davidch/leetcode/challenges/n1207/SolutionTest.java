package davidch.leetcode.challenges.n1207;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {1, 2, 2, 1, 1, 3};
        final var result = solution.uniqueOccurrences(arr);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] arr = {1, 2};
        final var result = solution.uniqueOccurrences(arr);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        final var result = solution.uniqueOccurrences(arr);
        assertThat(result).isTrue();
    }
}
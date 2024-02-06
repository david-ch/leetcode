package davidch.leetcode.challenges.n1043;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {1, 15, 7, 9, 2, 5, 10};
        final var result = solution.maxSumAfterPartitioning(arr, 3);
        assertThat(result).isEqualTo(84);
    }

    @Test
    void example_2() {
        final int[] arr = {1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        final var result = solution.maxSumAfterPartitioning(arr, 4);
        assertThat(result).isEqualTo(83);
    }

    @Test
    void example_3() {
        final int[] arr = {1};
        final var result = solution.maxSumAfterPartitioning(arr, 1);
        assertThat(result).isEqualTo(1);
    }
}
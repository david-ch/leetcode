package davidch.leetcode.challenges.n786;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {1, 2, 3, 5};
        final var result = solution.kthSmallestPrimeFraction(arr, 3);
        assertThat(result).isEqualTo(new int[]{2, 5});
    }

    @Test
    void example_2() {
        final int[] arr = {1, 7};
        final var result = solution.kthSmallestPrimeFraction(arr, 1);
        assertThat(result).isEqualTo(new int[]{1, 7});
    }
}
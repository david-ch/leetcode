package davidch.leetcode.challenges.n907;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {3, 1, 2, 4};
        final var result = solution.sumSubarrayMins(arr);
        assertThat(result).isEqualTo(17);
    }

    @Test
    void example_2() {
        final int[] arr = {11, 81, 94, 43, 3};
        final var result = solution.sumSubarrayMins(arr);
        assertThat(result).isEqualTo(444);
    }
}
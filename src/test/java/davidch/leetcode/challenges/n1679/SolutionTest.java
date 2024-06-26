package davidch.leetcode.challenges.n1679;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 4};
        final var result = solution.maxOperations(nums, 5);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {3, 1, 3, 4, 3};
        final var result = solution.maxOperations(nums, 6);
        assertThat(result).isEqualTo(1);
    }
}
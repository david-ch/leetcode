 package davidch.leetcode.challenges.n2680;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {12, 9};
        final var result = solution.maximumOr(nums, 1);
        assertThat(result).isEqualTo(30);
    }

    @Test
    void example_2() {
        final int[] nums = {8, 1, 2};
        final var result = solution.maximumOr(nums, 2);
        assertThat(result).isEqualTo(35);
    }
}
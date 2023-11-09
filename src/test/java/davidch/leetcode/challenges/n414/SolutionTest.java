package davidch.leetcode.challenges.n414;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 2, 1};
        final var result = solution.thirdMax(nums);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2};
        final var result = solution.thirdMax(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums = {2, 2, 3, 1};
        final var result = solution.thirdMax(nums);
        assertThat(result).isEqualTo(1);
    }
}
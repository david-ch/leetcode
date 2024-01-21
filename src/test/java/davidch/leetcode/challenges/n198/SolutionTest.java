package davidch.leetcode.challenges.n198;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 1};
        final var result = solution.rob(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 7, 9, 3, 1};
        final var result = solution.rob(nums);
        assertThat(result).isEqualTo(12);
    }

    @Test
    void example_3() {
        final int[] nums = {0, 2, 7, 9, 3, 1};
        final var result = solution.rob(nums);
        assertThat(result).isEqualTo(12);
    }

    @Test
    void example_4() {
        final int[] nums = {2};
        final var result = solution.rob(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_5() {
        final int[] nums = {2, 5};
        final var result = solution.rob(nums);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_6() {
        final int[] nums = {2, 1, 1, 2};
        final var result = solution.rob(nums);
        assertThat(result).isEqualTo(4);
    }
}
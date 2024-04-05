package davidch.leetcode.challenges.n1493;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 0, 1};
        final var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        final var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 1, 1};
        final var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(2);
    }
    @Test
    void example_4() {
        final int[] nums = {0, 0, 0};
        final var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_5() {
        final int[] nums = {0, 1, 1, 1};
        final var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_6() {
        final int[] nums = {1, 1, 1, 0};
        final var result = solution.longestSubarray(nums);
        assertThat(result).isEqualTo(3);
    }

}
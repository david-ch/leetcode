package davidch.leetcode.challenges.n1848;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 4, 5};
        final var result = solution.getMinDistance(nums, 5, 3);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] nums = {1};
        final var result = solution.getMinDistance(nums, 1, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        final var result = solution.getMinDistance(nums, 1, 0);
        assertThat(result).isEqualTo(0);
    }
}
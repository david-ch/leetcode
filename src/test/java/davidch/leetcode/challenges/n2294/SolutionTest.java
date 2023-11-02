package davidch.leetcode.challenges.n2294;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 6, 1, 2, 5};
        final var result = solution.partitionArray(nums, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3};
        final var result = solution.partitionArray(nums, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums = {2, 2, 4, 5};
        final var result = solution.partitionArray(nums, 0);
        assertThat(result).isEqualTo(3);
    }
}
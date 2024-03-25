package davidch.leetcode.challenges.n442;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        final var result = solution.findDuplicates(nums);
        assertThat(result).containsExactlyInAnyOrder(2, 3);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 1, 2};
        final var result = solution.findDuplicates(nums);
        assertThat(result).containsExactlyInAnyOrder(1);
    }

    @Test
    void example_3() {
        final int[] nums = {1};
        final var result = solution.findDuplicates(nums);
        assertThat(result).isEmpty();
    }
}
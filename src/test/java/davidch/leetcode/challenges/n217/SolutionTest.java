package davidch.leetcode.challenges.n217;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 1};
        final var result = solution.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3, 4};
        final var result = solution.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        final var result = solution.containsDuplicate(nums);
        assertThat(result).isTrue();
    }
}
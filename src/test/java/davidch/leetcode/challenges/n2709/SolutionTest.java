package davidch.leetcode.challenges.n2709;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 3, 6};
        final var result = solution.canTraverseAllPairs(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] nums = {3, 9, 5};
        final var result = solution.canTraverseAllPairs(nums);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[] nums = {4, 3, 12, 8};
        final var result = solution.canTraverseAllPairs(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final int[] nums = {10};
        final var result = solution.canTraverseAllPairs(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_5() {
        final int[] nums = {7, 36, 14, 42};
        final var result = solution.canTraverseAllPairs(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_6() {
        final int[] nums = {45, 39, 33, 44, 22};
        final var result = solution.canTraverseAllPairs(nums);
        assertThat(result).isTrue();
    }
}
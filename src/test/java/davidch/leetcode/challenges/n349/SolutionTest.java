package davidch.leetcode.challenges.n349;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums1 = {1, 2, 2, 1};
        final int[] nums2 = {2, 2};
        final var result = solution.intersection(nums1, nums2);
        assertThat(result).containsExactlyInAnyOrder(2);
    }

    @Test
    void example_2() {
        final int[] nums1 = {4, 9, 5};
        final int[] nums2 = {9, 4, 9, 8, 4};
        final var result = solution.intersection(nums1, nums2);
        assertThat(result).containsExactlyInAnyOrder(4, 9);
    }
}
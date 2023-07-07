package davidch.leetcode.challenges.n496;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums1 = {4, 1, 2};
        final int[] nums2 = {1, 3, 4, 2};
        final int[] expectedAns = {-1, 3, -1};
        final var result = solution.nextGreaterElement(nums1, nums2);
        assertThat(result).isEqualTo(expectedAns);
    }

    @Test
    void example_2() {
        final int[] nums1 = {2, 4};
        final int[] nums2 = {1, 2, 3, 4};
        final int[] expectedAns = {3, -1};
        final var result = solution.nextGreaterElement(nums1, nums2);
        assertThat(result).isEqualTo(expectedAns);
    }
}
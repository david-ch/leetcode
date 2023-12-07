package davidch.leetcode.challenges.n88;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums1 = {1, 2, 3, 0, 0, 0};
        final int[] nums2 = {2, 5, 6};
        final int[] expectedResult = {1, 2, 2, 3, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertThat(nums1).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums1 = {1};
        final int[] nums2 = {};
        final int[] expectedResult = {1};
        solution.merge(nums1, 1, nums2, 0);
        assertThat(nums1).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums1 = {0};
        final int[] nums2 = {1};
        final int[] expectedResult = {1};
        solution.merge(nums1, 0, nums2, 1);
        assertThat(nums1).isEqualTo(expectedResult);
    }
}
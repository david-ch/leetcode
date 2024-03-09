package davidch.leetcode.challenges.n2540;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums1 = {1, 2, 3};
        final int[] nums2 = {2, 4};
        final var result = solution.getCommon(nums1, nums2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums1 = {1, 2, 3, 6};
        final int[] nums2 = {2, 3, 4, 5};
        final var result = solution.getCommon(nums1, nums2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums1 = {1, 2, 3, 6};
        final int[] nums2 = {4, 4, 4, 5};
        final var result = solution.getCommon(nums1, nums2);
        assertThat(result).isEqualTo(-1);
    }
}
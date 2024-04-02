package davidch.leetcode.challenges.n2215;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums1 = {1, 2, 3};
        final int[] nums2 = {2, 4, 6};
        final var result = solution.findDifference(nums1, nums2);
        assertThat(result).isEqualTo(List.of(
            List.of(1, 3),
            List.of(4, 6)
        ));
    }

    @Test
    void example_2() {
        final int[] nums1 = {1, 2, 3, 3};
        final int[] nums2 = {1, 1, 2, 2};
        final var result = solution.findDifference(nums1, nums2);
        assertThat(result).isEqualTo(List.of(
            List.of(3),
            List.of()
        ));
    }
}
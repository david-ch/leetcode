package davidch.leetcode.challenges.n373;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums1 = {1, 7, 11};
        final int[] nums2 = {2, 4, 6};
        final var result = solution.kSmallestPairs(nums1, nums2, 3);
        assertThat(result).isEqualTo(List.of(
                List.of(1, 2),
                List.of(1, 4),
                List.of(1, 6)
        ));
    }

    @Test
    void example_2() {
        final int[] nums1 = {1, 1, 2};
        final int[] nums2 = {1, 2, 3};
        final var result = solution.kSmallestPairs(nums1, nums2, 2);
        assertThat(result).isEqualTo(List.of(
                List.of(1, 1),
                List.of(1, 1)
        ));
    }

    @Test
    void example_3() {
        final int[] nums1 = {1, 2};
        final int[] nums2 = {3};
        final var result = solution.kSmallestPairs(nums1, nums2, 3);
        assertThat(result).isEqualTo(List.of(
                List.of(1, 3),
                List.of(2, 3)
        ));
    }
}
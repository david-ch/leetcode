package davidch.leetcode.challenges.n26;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 2};
        final int[] expectedNums = {1, 2};
        final var result = solution.removeDuplicates(nums);
        assertThat(result).isEqualTo(2);
        assertThat(Arrays.copyOfRange(nums, 0, 2)).isEqualTo(expectedNums);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        final int[] expectedNums = {0, 1, 2, 3, 4};
        final var result = solution.removeDuplicates(nums);
        assertThat(result).isEqualTo(5);
        assertThat(Arrays.copyOfRange(nums, 0, 5)).isEqualTo(expectedNums);
    }
}
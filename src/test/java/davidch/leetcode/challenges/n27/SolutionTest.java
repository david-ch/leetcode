package davidch.leetcode.challenges.n27;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 2, 2, 3};
        final var result = solution.removeElement(nums, 3);
        assertThat(result).isEqualTo(2);
        assertThat(Arrays.copyOfRange(nums, 0, 2)).containsExactlyInAnyOrder(2, 2);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        final var result = solution.removeElement(nums, 2);
        assertThat(result).isEqualTo(5);
        assertThat(Arrays.copyOfRange(nums, 0, 5)).containsExactlyInAnyOrder(0, 1, 4, 0, 3);
    }

    @Test
    void example_3() {
        final int[] nums = {1};
        final var result = solution.removeElement(nums, 1);
        assertThat(result).isEqualTo(0);
    }
}
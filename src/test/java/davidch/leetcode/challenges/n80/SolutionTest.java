package davidch.leetcode.challenges.n80;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 1, 2, 2, 3};
        final var result = solution.removeDuplicates(nums);
        assertThat(result).isEqualTo(5);
        assertThat(nums).startsWith(1, 1, 2, 2, 3);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        final var result = solution.removeDuplicates(nums);
        assertThat(result).isEqualTo(7);
        assertThat(nums).startsWith(0, 0, 1, 1, 2, 3, 3);
    }
}
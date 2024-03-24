package davidch.leetcode.challenges.n287;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, 4, 2, 2};
        final var result = solution.findDuplicate(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {3, 1, 3, 4, 2};
        final var result = solution.findDuplicate(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[] nums = {3, 3, 3, 3, 3};
        final var result = solution.findDuplicate(nums);
        assertThat(result).isEqualTo(3);
    }
}
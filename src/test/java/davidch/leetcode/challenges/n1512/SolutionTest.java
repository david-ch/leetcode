package davidch.leetcode.challenges.n1512;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 1, 1, 3};
        final var result = solution.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 1, 1, 1};
        final var result = solution.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 2, 3};
        final var result = solution.numIdenticalPairs(nums);
        assertThat(result).isEqualTo(0);
    }
}
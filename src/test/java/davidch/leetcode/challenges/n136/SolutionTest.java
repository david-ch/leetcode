package davidch.leetcode.challenges.n136;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2,2,1};
        final var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] nums = {4,1,2,1,2};
        final var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[] nums = {1};
        final var result = solution.singleNumber(nums);
        assertThat(result).isEqualTo(1);
    }
}
package davidch.leetcode.challenges.n169;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 2, 3};
        final var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 2, 1, 1, 1, 2, 2};
        final var result = solution.majorityElement(nums);
        assertThat(result).isEqualTo(2);
    }
}
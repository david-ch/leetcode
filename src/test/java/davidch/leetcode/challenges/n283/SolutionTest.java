package davidch.leetcode.challenges.n283;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {0, 1, 0, 3, 12};
        final int[] expectedResult = {1, 3, 12, 0, 0};

        solution.moveZeroes(nums);

        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {0};
        final int[] expectedResult = {0};

        solution.moveZeroes(nums);

        assertThat(nums).isEqualTo(expectedResult);
    }
}
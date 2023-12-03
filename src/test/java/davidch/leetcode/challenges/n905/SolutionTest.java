package davidch.leetcode.challenges.n905;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 1, 2, 4};
        final int[] expectedResult = {4, 2, 1, 3};
        solution.sortArrayByParity(nums);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {0};
        final int[] expectedResult = {0};
        solution.sortArrayByParity(nums);
        assertThat(nums).isEqualTo(expectedResult);
    }
}
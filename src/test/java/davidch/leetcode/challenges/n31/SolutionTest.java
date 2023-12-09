package davidch.leetcode.challenges.n31;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3};
        final int[] expectedResult = {1, 3, 2};
        solution.nextPermutation(nums);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {3, 2, 1};
        final int[] expectedResult = {1, 2, 3};
        solution.nextPermutation(nums);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 1, 5};
        final int[] expectedResult = {1, 5, 1};
        solution.nextPermutation(nums);
        assertThat(nums).isEqualTo(expectedResult);
    }
}
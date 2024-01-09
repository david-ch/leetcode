package davidch.leetcode.challenges.n189;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7};
        final int[] expectedResult = {5, 6, 7, 1, 2, 3, 4};
        solution.rotate(nums, 3);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {-1, -100, 3, 99};
        final int[] expectedResult = {3, 99, -1, -100};
        solution.rotate(nums, 2);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] expectedResult = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 2);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_4() {
        final int[] nums = {1};
        final int[] expectedResult = {1};
        solution.rotate(nums, 0);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_5() {
        final int[] nums = {1};
        final int[] expectedResult = {1};
        solution.rotate(nums, 1);
        assertThat(nums).isEqualTo(expectedResult);
    }

    @Test
    void example_6() {
        final int[] nums = {1};
        final int[] expectedResult = {1};
        solution.rotate(nums, 2);
        assertThat(nums).isEqualTo(expectedResult);
    }
}
package davidch.leetcode.challenges.n977;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {-4,-1,0,3,10};
        final int[] expected = {0,1,9,16,100};

        final var result = solution.sortedSquares(nums);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final int[] nums = {-7,-3,2,3,11};
        final int[] expected = {4,9,9,49,121};

        final var result = solution.sortedSquares(nums);

        assertThat(result).isEqualTo(expected);
    }
}
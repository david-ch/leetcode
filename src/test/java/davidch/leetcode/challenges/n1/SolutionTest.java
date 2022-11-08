package davidch.leetcode.challenges.n1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] input = {2, 7, 11, 15};
        final var result = solution.twoSum(input, 9);

        assertThat(result).isEqualTo(new int[]{0, 1});
    }

    @Test
    void example_2() {
        final int[] input = {3, 2, 4};
        final var result = solution.twoSum(input, 6);

        assertThat(result).isEqualTo(new int[]{1, 2});
    }

    @Test
    void example_3() {
        final int[] input = {3, 3};
        final var result = solution.twoSum(input, 6);

        assertThat(result).isEqualTo(new int[]{0, 1});
    }
}
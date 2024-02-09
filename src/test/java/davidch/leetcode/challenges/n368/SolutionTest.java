package davidch.leetcode.challenges.n368;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3};
        final var result = solution.largestDivisibleSubset(nums);

        assertThat(result).isEqualTo(List.of(1, 2));
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 4, 8};
        final var result = solution.largestDivisibleSubset(nums);

        assertThat(result).isEqualTo(List.of(1, 2, 4, 8));
    }

    @Test
    void example_3() {
        final int[] nums = {3, 4, 16, 8};
        final var result = solution.largestDivisibleSubset(nums);

        assertThat(result).isEqualTo(List.of(4, 8, 16));
    }

    @Test
    void example_4() {
        final int[] nums = {4, 8, 10, 240};
        final var result = solution.largestDivisibleSubset(nums);

        assertThat(result).isEqualTo(List.of(4, 8, 240));
    }

}
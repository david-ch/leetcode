package davidch.leetcode.challenges.n3068;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 1};
        final int[][] edges = {{0, 1}, {0, 2}};
        final var result = solution.maximumValueSum(nums, 3, edges);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 3};
        final int[][] edges = {{0, 1}};
        final var result = solution.maximumValueSum(nums, 7, edges);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_3() {
        final int[] nums = {7, 7, 7, 7, 7, 7};
        final int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}};
        final var result = solution.maximumValueSum(nums, 3, edges);
        assertThat(result).isEqualTo(42);
    }

    @Test
    void example_4() {
        final int[] nums = {78, 43, 92, 97, 95, 94};
        final int[][] edges = {{1, 2}, {3, 0}, {4, 0}, {0, 1}, {1, 5}};
        final var result = solution.maximumValueSum(nums, 6, edges);
        assertThat(result).isEqualTo(507);
    }
}
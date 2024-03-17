package davidch.leetcode.challenges.n57;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] intervals = {{1, 3}, {6, 9}};
        final int[] newInterval = {2, 5};
        final var result = solution.insert(intervals, newInterval);

        final int[][] expectedResult = {{1, 5}, {6, 9}};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        final int[] newInterval = {4, 8};
        final var result = solution.insert(intervals, newInterval);

        final int[][] expectedResult = {{1, 2}, {3, 10}, {12, 16}};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[][] intervals = {{1, 5}};
        final int[] newInterval = {2, 3};
        final var result = solution.insert(intervals, newInterval);

        final int[][] expectedResult = {{1, 5}};
        assertThat(result).isEqualTo(expectedResult);
    }
}
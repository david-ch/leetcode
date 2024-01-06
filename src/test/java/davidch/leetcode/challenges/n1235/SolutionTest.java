package davidch.leetcode.challenges.n1235;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] startTime = {1, 2, 3, 3};
        final int[] endTime = {3, 4, 5, 6};
        final int[] profit = {50, 10, 40, 70};
        final var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(120);
    }

    @Test
    void example_2() {
        final int[] startTime = {1, 2, 3, 4, 6};
        final int[] endTime = {3, 5, 10, 6, 9};
        final int[] profit = {20, 20, 100, 70, 60};
        final var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(150);
    }

    @Test
    void example_3() {
        final int[] startTime = {1, 1, 1};
        final int[] endTime = {2, 3, 4};
        final int[] profit = {5, 6, 4};
        final var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_4() {
        final int[] startTime = {6, 15, 7, 11, 1, 3, 16, 2};
        final int[] endTime = {19, 18, 19, 16, 10, 8, 19, 8};
        final int[] profit = {2, 9, 1, 19, 5, 7, 3, 19};
        final var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(41);
    }
}
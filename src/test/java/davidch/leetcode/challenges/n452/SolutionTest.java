package davidch.leetcode.challenges.n452;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        final var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        final var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        final var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_4() {
        final int[][] points = {{-2147483648, 2147483647}};
        final var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_5() {
        final int[][] points = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        final var result = solution.findMinArrowShots(points);
        assertThat(result).isEqualTo(2);
    }
}
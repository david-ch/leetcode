package davidch.leetcode.challenges.n1637;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        final var result = solution.maxWidthOfVerticalArea(points);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[][] points = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
        final var result = solution.maxWidthOfVerticalArea(points);
        assertThat(result).isEqualTo(3);
    }
}
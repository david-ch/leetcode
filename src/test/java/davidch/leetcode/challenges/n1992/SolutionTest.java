package davidch.leetcode.challenges.n1992;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] land = {
            {1, 0, 0},
            {0, 1, 1},
            {0, 1, 1}
        };
        final var result = solution.findFarmland(land);
        final int[][] expectedResult = {
            {0, 0, 0, 0},
            {1, 1, 2, 2},
        };
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] land = {
            {1, 1},
            {1, 1}
        };
        final var result = solution.findFarmland(land);
        final int[][] expectedResult = {
            {0, 0, 1, 1}
        };
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[][] land = {
            {0}
        };
        final var result = solution.findFarmland(land);
        assertThat(result).isEmpty();
    }
}
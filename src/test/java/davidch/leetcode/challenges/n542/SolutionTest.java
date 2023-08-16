package davidch.leetcode.challenges.n542;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        final int[][] expectedResult = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        final var result = solution.updateMatrix(mat);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        final int[][] expectedResult = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        final var result = solution.updateMatrix(mat);
        assertThat(result).isEqualTo(expectedResult);
    }
}
package davidch.leetcode.challenges.n1376;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var n = 1;
        final var headID = 0;
        final int[] manager = {-1};
        final int[] informTime = {0};
        final var result = solution.numOfMinutes(n, headID, manager, informTime);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final var n = 6;
        final var headID = 2;
        final int[] manager = {2, 2, -1, 2, 2, 2};
        final int[] informTime = {0, 0, 1, 0, 0, 0};
        final var result = solution.numOfMinutes(n, headID, manager, informTime);
        assertThat(result).isEqualTo(1);
    }
}
package davidch.leetcode.challenges.n789;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] ghosts = {{1, 0}, {0, 3}};
        final int[] target = {0, 1};
        final var result = solution.escapeGhosts(ghosts, target);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[][] ghosts = {{1, 0}};
        final int[] target = {2, 0};
        final var result = solution.escapeGhosts(ghosts, target);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[][] ghosts = {{2, 0}};
        final int[] target = {1, 0};
        final var result = solution.escapeGhosts(ghosts, target);
        assertThat(result).isFalse();
    }
}
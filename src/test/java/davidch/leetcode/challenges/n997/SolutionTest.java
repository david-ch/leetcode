package davidch.leetcode.challenges.n997;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] trust = {{1, 2}};
        final var result = solution.findJudge(2, trust);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[][] trust = {{1, 3}, {2, 3}};
        final var result = solution.findJudge(3, trust);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        final var result = solution.findJudge(3, trust);
        assertThat(result).isEqualTo(-1);
    }
}
package davidch.leetcode.challenges.n886;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] dislikes = {{1, 2}, {1, 3}, {2, 4}};
        final var result = solution.possibleBipartition(4, dislikes);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[][] dislikes = {{1, 2}, {1, 3}, {2, 3}};
        final var result = solution.possibleBipartition(3, dislikes);
        assertThat(result).isFalse();
    }
}
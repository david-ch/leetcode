package davidch.leetcode.challenges.n2101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] bombs = {{2, 1, 3}, {6, 1, 4}};
        final var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[][] bombs = {{1, 1, 5}, {10, 10, 5}};
        final var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[][] bombs = {{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}};
        final var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_4() {
        final int[][] bombs = {{1, 1, 100000}, {100000, 100000, 1}};
        final var result = solution.maximumDetonation(bombs);
        assertThat(result).isEqualTo(1);
    }
}
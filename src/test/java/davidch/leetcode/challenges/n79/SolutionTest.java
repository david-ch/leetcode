package davidch.leetcode.challenges.n79;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        final var result = solution.exist(board, "ABCCED");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        final var result = solution.exist(board, "SEE");
        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        final var result = solution.exist(board, "ABCB");
        assertThat(result).isFalse();
    }
}
package davidch.leetcode.challenges.n2139;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.minMoves(5, 0);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.minMoves(19, 2);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_3() {
        final var result = solution.minMoves(10, 4);
        assertThat(result).isEqualTo(4);
    }

}
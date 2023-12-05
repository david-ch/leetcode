package davidch.leetcode.challenges.n593;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] p1 = {0, 0};
        final int[] p2 = {1, 1};
        final int[] p3 = {1, 0};
        final int[] p4 = {0, 1};
        final var result = solution.validSquare(p1, p2, p3, p4);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] p1 = {0, 0};
        final int[] p2 = {1, 1};
        final int[] p3 = {1, 0};
        final int[] p4 = {0, 12};
        final var result = solution.validSquare(p1, p2, p3, p4);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[] p1 = {1, 0};
        final int[] p2 = {-1, 0};
        final int[] p3 = {0, 1};
        final int[] p4 = {0, -1};
        final var result = solution.validSquare(p1, p2, p3, p4);
        assertThat(result).isTrue();
    }
}
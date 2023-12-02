package davidch.leetcode.challenges.n1326;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] ranges = {3, 4, 1, 1, 0, 0};
        final var result = solution.minTaps(5, ranges);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] ranges = {0, 0, 0, 0};
        final var result = solution.minTaps(3, ranges);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_3() {
        final int[] ranges = {1, 2, 1, 0, 2, 1, 0, 1};
        final var result = solution.minTaps(7, ranges);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_4() {
        final int[] ranges = {0, 5, 0, 3, 3, 3, 1, 4, 0, 4};
        final var result = solution.minTaps(9, ranges);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_5() {
        final int[] ranges = {0, 3, 3, 2, 2, 4, 2, 1, 5, 1, 0, 1, 2, 3, 0, 3, 1, 1};
        final var result = solution.minTaps(17, ranges);
        assertThat(result).isEqualTo(3);
    }
}
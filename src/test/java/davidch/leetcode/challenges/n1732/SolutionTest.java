package davidch.leetcode.challenges.n1732;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] gain = {-5, 1, 5, 0, -7};
        final var result = solution.largestAltitude(gain);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        final var result = solution.largestAltitude(gain);
        assertThat(result).isEqualTo(0);
    }
}
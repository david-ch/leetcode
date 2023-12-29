package davidch.leetcode.challenges.n688;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.knightProbability(3, 2, 0, 0);
        assertThat(result).isEqualTo(.06250);
    }

    @Test
    void example_2() {
        final var result = solution.knightProbability(1, 0, 0, 0);
        assertThat(result).isEqualTo(1.);
    }

    @Test
    void example_3() {
        final var result = solution.knightProbability(8, 30, 6, 4);
        assertThat(result).isEqualTo(.00019, Offset.offset(0.0001));
    }
}
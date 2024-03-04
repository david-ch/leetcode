package davidch.leetcode.challenges.n948;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] tokens = {100};
        final var result = solution.bagOfTokensScore(tokens, 50);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final int[] tokens = {200, 100};
        final var result = solution.bagOfTokensScore(tokens, 150);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] tokens = {100, 200, 300, 400};
        final var result = solution.bagOfTokensScore(tokens, 200);
        assertThat(result).isEqualTo(2);
    }
}
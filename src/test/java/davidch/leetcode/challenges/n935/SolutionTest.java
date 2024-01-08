package davidch.leetcode.challenges.n935;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.knightDialer(1);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void example_2() {
        final var result = solution.knightDialer(2);
        assertThat(result).isEqualTo(20);
    }

    @Test
    void example_3() {
        final var result = solution.knightDialer(3131);
        assertThat(result).isEqualTo(136006598);
    }
}
package davidch.leetcode.challenges.n808;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.soupServings(50);
        assertThat(result).isEqualTo(0.625);
    }

    @Test
    void example_2() {
        final var result = solution.soupServings(100);
        assertThat(result).isEqualTo(0.71875);
    }

    @Test
    void example_3() {
        final var result = solution.soupServings(660295675);
        assertThat(result).isEqualTo(1.0);
    }

    @Test
    void example_4() {
        final var result = solution.soupServings(1);
        assertThat(result).isEqualTo(0.625);
    }
}
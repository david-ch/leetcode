package davidch.leetcode.challenges.n1496;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.isPathCrossing("NES");
        assertThat(result).isFalse();
    }

    @Test
    void example_2() {
        final var result = solution.isPathCrossing("NESWW");
        assertThat(result).isTrue();
    }
}
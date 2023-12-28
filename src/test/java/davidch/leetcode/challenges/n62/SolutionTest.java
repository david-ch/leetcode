package davidch.leetcode.challenges.n62;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.uniquePaths(3, 7);
        assertThat(result).isEqualTo(28);
    }

    @Test
    void example_2() {
        final var result = solution.uniquePaths(3, 2);
        assertThat(result).isEqualTo(3);
    }
}
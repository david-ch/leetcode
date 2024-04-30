package davidch.leetcode.challenges.n1915;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.wonderfulSubstrings("aba");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.wonderfulSubstrings("aabb");
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_3() {
        final var result = solution.wonderfulSubstrings("he");
        assertThat(result).isEqualTo(2);
    }
}
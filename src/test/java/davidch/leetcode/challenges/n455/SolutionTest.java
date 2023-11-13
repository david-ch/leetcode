package davidch.leetcode.challenges.n455;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] g = {1, 2, 3};
        final int[] s = {1, 1};
        final var result = solution.findContentChildren(g, s);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] g = {1, 2};
        final int[] s = {1, 2, 3};
        final var result = solution.findContentChildren(g, s);
        assertThat(result).isEqualTo(2);
    }
}
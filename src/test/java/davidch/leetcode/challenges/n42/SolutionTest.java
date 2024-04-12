package davidch.leetcode.challenges.n42;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        final var result = solution.trap(height);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] height = {4, 2, 0, 3, 2, 5};
        final var result = solution.trap(height);
        assertThat(result).isEqualTo(9);
    }
}
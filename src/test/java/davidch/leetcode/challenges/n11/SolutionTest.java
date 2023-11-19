package davidch.leetcode.challenges.n11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        final var result = solution.maxArea(height);
        assertThat(result).isEqualTo(49);
    }

    @Test
    void example_2() {
        final int[] height = {1, 1};
        final var result = solution.maxArea(height);
        assertThat(result).isEqualTo(1);
    }
}
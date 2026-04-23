package davidch.leetcode.challenges.n84;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var heights = new int[]{2, 1, 5, 6, 2, 3};
        final var result = solution.largestRectangleArea(heights);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void example_2() {
        final var heights = new int[]{2, 4};
        final var result = solution.largestRectangleArea(heights);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final var heights = new int[]{2, 1, 2};
        final var result = solution.largestRectangleArea(heights);
        assertThat(result).isEqualTo(3);
    }
}
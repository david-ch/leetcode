package davidch.leetcode.challenges.n1642;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] heights = {4, 2, 7, 6, 9, 14, 12};
        final var result = solution.furthestBuilding(heights, 5, 1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] heights = {4, 12, 2, 7, 3, 18, 20, 3, 19};
        final var result = solution.furthestBuilding(heights, 10, 2);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_3() {
        final int[] heights = {14, 3, 19, 3};
        final var result = solution.furthestBuilding(heights, 17, 0);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_4() {
        final int[] heights = {1, 5, 1, 2, 3, 4, 10000};
        final var result = solution.furthestBuilding(heights, 4, 1);
        assertThat(result).isEqualTo(5);
    }
}
package davidch.leetcode.challenges.n1944;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] heights = {10, 6, 8, 5, 11, 9};
        final int[] expectedResult = {3, 1, 2, 1, 1, 0};
        final var result = solution.canSeePersonsCount(heights);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] heights = {5, 1, 2, 3, 10};
        final int[] expectedResult = {4, 1, 1, 1, 0};
        final var result = solution.canSeePersonsCount(heights);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] heights = {3, 1, 5, 8, 6};
        final int[] expectedResult = {2, 1, 1, 1, 0};
        final var result = solution.canSeePersonsCount(heights);
        assertThat(result).isEqualTo(expectedResult);
    }
}
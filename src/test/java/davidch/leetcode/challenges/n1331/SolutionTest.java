package davidch.leetcode.challenges.n1331;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {40, 10, 20, 30};
        final var result = solution.arrayRankTransform(arr);
        final int[] expectedResult = {4, 1, 2, 3};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] arr = {100, 100, 100};
        final var result = solution.arrayRankTransform(arr);
        final int[] expectedResult = {1, 1, 1};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        final var result = solution.arrayRankTransform(arr);
        final int[] expectedResult = {5, 3, 4, 2, 8, 6, 7, 1, 3};
        assertThat(result).isEqualTo(expectedResult);
    }
}
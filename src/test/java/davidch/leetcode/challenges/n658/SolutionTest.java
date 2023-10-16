package davidch.leetcode.challenges.n658;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] arr = {1, 2, 3, 4, 5};
        final var expectedResult = List.of(1, 2, 3, 4);
        final var result = solution.findClosestElements(arr, 4, 3);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] arr = {1, 2, 3, 4, 5};
        final var expectedResult = List.of(1, 2, 3, 4);
        final var result = solution.findClosestElements(arr, 4, -1);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] arr = {1, 1, 1, 10, 10, 10};
        final var expectedResult = List.of(10);
        final var result = solution.findClosestElements(arr, 1, 9);
        assertThat(result).isEqualTo(expectedResult);
    }
}
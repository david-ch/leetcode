package davidch.leetcode.challenges.n973;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] points = {{1, 3}, {-2, 2}};
        final int[][] expectedResult = {{-2, 2}};
        final var result = solution.kClosest(points, 1);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        final var result = solution.kClosest(points, 2);
        assertThat(Arrays.stream(result).toList()).containsExactlyInAnyOrder(
                new int[]{3, 3},
                new int[]{-2, 4}
        );
    }
}
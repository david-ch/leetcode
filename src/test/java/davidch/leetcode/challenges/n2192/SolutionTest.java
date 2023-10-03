package davidch.leetcode.challenges.n2192;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] edges = {{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
        final var expectedResult = List.of(
                List.of(),
                List.of(),
                List.of(),
                List.of(0, 1),
                List.of(0, 2),
                List.of(0, 1, 3),
                List.of(0, 1, 2, 3, 4),
                List.of(0, 1, 2, 3)
        );
        final var result = solution.getAncestors(8, edges);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        final var expectedResult = List.of(
                List.of(),
                List.of(0),
                List.of(0, 1),
                List.of(0, 1, 2),
                List.of(0, 1, 2, 3)
        );
        final var result = solution.getAncestors(5, edges);
        assertThat(result).isEqualTo(expectedResult);
    }
}
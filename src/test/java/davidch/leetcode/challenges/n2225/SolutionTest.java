package davidch.leetcode.challenges.n2225;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] matches = {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}
        };

        final var results = solution.findWinners(matches);

        assertThat(results).isEqualTo(List.of(
                List.of(1, 2, 10),
                List.of(4, 5, 7, 8)
        ));
    }

    @Test
    void example_2() {
        final int[][] matches = {
                {2, 3}, {1, 3}, {5, 4}, {6, 4}
        };

        final var results = solution.findWinners(matches);

        assertThat(results).isEqualTo(List.of(
                List.of(1, 2, 5, 6),
                List.of()
        ));
    }
}
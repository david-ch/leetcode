package davidch.leetcode.challenges.n2248;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] nums = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };

        final var result = solution.intersection(nums);

        assertThat(result).isEqualTo(List.of(3, 4));
    }

    @Test
    void example_2() {
        final int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
        };

        final var result = solution.intersection(nums);

        assertThat(result).isEqualTo(emptyList());
    }
}
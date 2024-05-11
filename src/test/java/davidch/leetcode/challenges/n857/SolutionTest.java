package davidch.leetcode.challenges.n857;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] quality = {10, 20, 5};
        final int[] wage = {70, 50, 30};
        final var result = solution.mincostToHireWorkers(quality, wage, 2);
        assertThat(result).isCloseTo(105., offset(Math.pow(10, -5)));
    }

    @Test
    void example_2() {
        final int[] quality = {3, 1, 10, 10, 1};
        final int[] wage = {4, 8, 2, 2, 7};
        final var result = solution.mincostToHireWorkers(quality, wage, 3);
        assertThat(result).isCloseTo(30.66667, offset(Math.pow(10, -5)));
    }
}
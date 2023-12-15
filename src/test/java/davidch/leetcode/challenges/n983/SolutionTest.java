package davidch.leetcode.challenges.n983;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] days = {1, 4, 6, 7, 8, 20};
        final int[] costs = {2, 7, 15};
        final var result = solution.mincostTickets(days, costs);
        assertThat(result).isEqualTo(11);
    }

    @Test
    void example_2() {
        final int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        final int[] costs = {2, 7, 15};
        final var result = solution.mincostTickets(days, costs);
        assertThat(result).isEqualTo(17);
    }
}
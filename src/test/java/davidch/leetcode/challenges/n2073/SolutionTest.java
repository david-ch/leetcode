package davidch.leetcode.challenges.n2073;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] tickets = {2, 3, 2};
        final var result = solution.timeRequiredToBuy(tickets, 2);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] tickets = {5, 1, 1, 1};
        final var result = solution.timeRequiredToBuy(tickets, 0);
        assertThat(result).isEqualTo(8);
    }
}
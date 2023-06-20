package davidch.leetcode.challenges.n2260;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] cards = {3, 4, 2, 3, 4, 7};
        final var result = solution.minimumCardPickup(cards);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] cards = {1, 0, 5, 3};
        final var result = solution.minimumCardPickup(cards);
        assertThat(result).isEqualTo(-1);
    }
}
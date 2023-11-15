package davidch.leetcode.challenges.n2410;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] players = {4, 7, 9};
        final int[] trainers = {8, 2, 5, 8};
        final var result = solution.matchPlayersAndTrainers(players, trainers);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] players = {1, 1, 1};
        final int[] trainers = {10};
        final var result = solution.matchPlayersAndTrainers(players, trainers);
        assertThat(result).isEqualTo(1);
    }
}
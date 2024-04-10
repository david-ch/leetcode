package davidch.leetcode.challenges.n950;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] deck = {17, 13, 11, 2, 3, 5, 7};
        final var result = solution.deckRevealedIncreasing(deck);
        final int[] expectedResult = {2, 13, 3, 11, 5, 17, 7};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] deck = {1, 1000};
        final var result = solution.deckRevealedIncreasing(deck);
        final int[] expectedResult = {1, 1000};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] deck = {17, 13, 11, 2, 3, 5, 7, 20};
        final var result = solution.deckRevealedIncreasing(deck);
        final int[] expectedResult = {2, 11, 3, 17, 5, 13, 7, 20};
        assertThat(result).isEqualTo(expectedResult);
    }
}
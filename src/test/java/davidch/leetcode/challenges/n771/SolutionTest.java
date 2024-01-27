package davidch.leetcode.challenges.n771;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var jewels = "aA";
        final var stones = "aAAbbbb";
        final var result = solution.numJewelsInStones(jewels, stones);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var jewels = "z";
        final var stones = "ZZ";
        final var result = solution.numJewelsInStones(jewels, stones);
        assertThat(result).isEqualTo(0);
    }
}
package davidch.leetcode.challenges.n649;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.predictPartyVictory("RD");
        assertThat(result).isEqualTo("Radiant");
    }

    @Test
    void example_2() {
        final var result = solution.predictPartyVictory("RDD");
        assertThat(result).isEqualTo("Dire");
    }

    @Test
    void example_3() {
        final var result = solution.predictPartyVictory("D");
        assertThat(result).isEqualTo("Dire");
    }

    @Test
    void example_4() {
        final var result = solution.predictPartyVictory("DDRRR");
        assertThat(result).isEqualTo("Dire");
    }

}
package davidch.leetcode.challenges.n2486;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.appendCharacters("coaching", "coding");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.appendCharacters("abcde", "a");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final var result = solution.appendCharacters("z", "abcde");
        assertThat(result).isEqualTo(5);
    }
}
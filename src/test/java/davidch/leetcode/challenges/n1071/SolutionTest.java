package davidch.leetcode.challenges.n1071;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.gcdOfStrings("ABCABC", "ABC");
        assertThat(result).isEqualTo("ABC");
    }

    @Test
    void example_2() {
        final var result = solution.gcdOfStrings("ABABAB", "ABAB");
        assertThat(result).isEqualTo("AB");
    }

    @Test
    void example_3() {
        final var result = solution.gcdOfStrings("LEET", "CODE");
        assertThat(result).isEqualTo("");
    }
}
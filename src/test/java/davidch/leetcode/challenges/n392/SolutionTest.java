package davidch.leetcode.challenges.n392;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var s = "abc";
        final var t = "ahbgdc";
        final var result = solution.isSubsequence(s, t);

        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var s = "axc";
        final var t = "ahbgdc";
        final var result = solution.isSubsequence(s, t);

        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var s = "";
        final var t = "ahbgdc";
        final var result = solution.isSubsequence(s, t);

        assertThat(result).isTrue();
    }
}
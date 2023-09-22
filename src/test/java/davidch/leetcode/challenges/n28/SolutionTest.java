package davidch.leetcode.challenges.n28;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var haystack = "sadbutsad";
        final var needle = "sad";
        final var result = solution.strStr(haystack, needle);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final var haystack = "leetcode";
        final var needle = "leeto";
        final var result = solution.strStr(haystack, needle);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_3() {
        final var haystack = "mississippi";
        final var needle = "issip";
        final var result = solution.strStr(haystack, needle);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_4() {
        final var haystack = "a";
        final var needle = "a";
        final var result = solution.strStr(haystack, needle);
        assertThat(result).isEqualTo(0);
    }
}
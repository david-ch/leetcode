package davidch.leetcode.challenges.n14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] strs = {"flower", "flow", "flight"};
        final var result = solution.longestCommonPrefix(strs);
        assertThat(result).isEqualTo("fl");
    }

    @Test
    void example_2() {
        final String[] strs = {"dog", "racecar", "car"};
        final var result = solution.longestCommonPrefix(strs);
        assertThat(result).isEqualTo("");
    }
}
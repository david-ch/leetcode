package davidch.leetcode.challenges.n3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.lengthOfLongestSubstring("abcabcbb");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.lengthOfLongestSubstring("bbbbb");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final var result = solution.lengthOfLongestSubstring("pwwkew");
        assertThat(result).isEqualTo(3);
    }
}
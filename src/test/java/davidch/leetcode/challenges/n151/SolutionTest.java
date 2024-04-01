package davidch.leetcode.challenges.n151;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.reverseWords("the sky is blue");
        assertThat(result).isEqualTo("blue is sky the");
    }

    @Test
    void example_2() {
        final var result = solution.reverseWords("  hello world  ");
        assertThat(result).isEqualTo("world hello");
    }

    @Test
    void example_3() {
        final var result = solution.reverseWords("a good   example");
        assertThat(result).isEqualTo("example good a");
    }
}
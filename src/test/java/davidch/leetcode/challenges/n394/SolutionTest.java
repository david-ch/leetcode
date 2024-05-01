package davidch.leetcode.challenges.n394;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.decodeString("3[a]2[bc]");
        assertThat(result).isEqualTo("aaabcbc");
    }

    @Test
    void example_2() {
        final var result = solution.decodeString("3[a2[c]]");
        assertThat(result).isEqualTo("accaccacc");
    }

    @Test
    void example_3() {
        final var result = solution.decodeString("2[abc]3[cd]ef");
        assertThat(result).isEqualTo("abcabccdcdcdef");
    }
}
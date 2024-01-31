package davidch.leetcode.challenges.n316;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.removeDuplicateLetters("bcabc");
        assertThat(result).isEqualTo("abc");
    }

    @Test
    void example_2() {
        final var result = solution.removeDuplicateLetters("cbacdcbc");
        assertThat(result).isEqualTo("acdb");
    }

    @Test
    void example_3() {
        final var result = solution.removeDuplicateLetters("leetcode");
        assertThat(result).isEqualTo("letcod");
    }
}
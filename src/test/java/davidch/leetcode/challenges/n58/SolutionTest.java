package davidch.leetcode.challenges.n58;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.lengthOfLastWord("Hello World");
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final var result = solution.lengthOfLastWord("   fly me   to   the moon  ");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final var result = solution.lengthOfLastWord("luffy is still joyboy");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void ending_with_space() {
        final var result = solution.lengthOfLastWord("a  ");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void the_only_word() {
        final var result = solution.lengthOfLastWord("luffy");
        assertThat(result).isEqualTo(5);
    }
}
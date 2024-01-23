package davidch.leetcode.challenges.n1239;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxLength(List.of("un", "iq", "ue"));
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.maxLength(List.of("cha", "r", "act", "ers"));
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final var result = solution.maxLength(List.of("abcdefghijklmnopqrstuvwxyz"));
        assertThat(result).isEqualTo(26);
    }

    @Test
    void example_4() {
        final var result = solution.maxLength(List.of("aa", "bb"));
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_5() {
        final var result = solution.maxLength(List.of("a", "abc", "d", "de", "def"));
        assertThat(result).isEqualTo(6);
    }
}
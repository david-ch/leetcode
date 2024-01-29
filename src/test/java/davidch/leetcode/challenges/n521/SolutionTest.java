package davidch.leetcode.challenges.n521;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.findLUSlength("aba", "cdc");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.findLUSlength("aaa", "bbb");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final var result = solution.findLUSlength("aaa", "aaa");
        assertThat(result).isEqualTo(-1);
    }
}
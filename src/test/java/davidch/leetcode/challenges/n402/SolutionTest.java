package davidch.leetcode.challenges.n402;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.removeKdigits("1432219", 3);
        assertThat(result).isEqualTo("1219");
    }

    @Test
    void example_2() {
        final var result = solution.removeKdigits("10200", 1);
        assertThat(result).isEqualTo("200");
    }

    @Test
    void example_3() {
        final var result = solution.removeKdigits("10", 2);
        assertThat(result).isEqualTo("0");
    }

    @Test
    void example_4() {
        final var result = solution.removeKdigits("10432219", 3);
        assertThat(result).isEqualTo("2219");
    }

    @Test
    void example_5() {
        final var result = solution.removeKdigits("1111111", 3);
        assertThat(result).isEqualTo("1111");
    }

    @Test
    void example_6() {
        final var result = solution.removeKdigits("1234567890", 9);
        assertThat(result).isEqualTo("0");
    }

    @Test
    void example_7() {
        final var result = solution.removeKdigits("9", 1);
        assertThat(result).isEqualTo("0");
    }

    @Test
    void example_8() {
        final var result = solution.removeKdigits("112", 1);
        assertThat(result).isEqualTo("11");
    }
}
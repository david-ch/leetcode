package davidch.leetcode.challenges.n2000;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.reversePrefix("abcdefd", 'd');

        assertThat(result).isEqualTo("dcbaefd");
    }

    @Test
    void example_2() {
        final var result = solution.reversePrefix("xyxzxe", 'z');

        assertThat(result).isEqualTo("zxyxxe");
    }

    @Test
    void example_3() {
        final var result = solution.reversePrefix("abcd", 'z');

        assertThat(result).isEqualTo("abcd");
    }
}
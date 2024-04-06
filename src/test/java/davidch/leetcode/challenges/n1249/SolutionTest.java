package davidch.leetcode.challenges.n1249;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.minRemoveToMakeValid("lee(t(c)o)de)");
        assertThat(result).isEqualTo("lee(t(c)o)de");
    }

    @Test
    void example_2() {
        final var result = solution.minRemoveToMakeValid("a)b(c)d");
        assertThat(result).isEqualTo("ab(c)d");
    }

    @Test
    void example_3() {
        final var result = solution.minRemoveToMakeValid("))((");
        assertThat(result).isEqualTo("");
    }

    @Test
    void example_4() {
        final var result = solution.minRemoveToMakeValid("(a(b(c)d)");
        assertThat(result).isEqualTo("a(b(c)d)");
    }
}
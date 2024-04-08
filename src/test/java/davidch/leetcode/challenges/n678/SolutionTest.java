package davidch.leetcode.challenges.n678;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.checkValidString("()");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.checkValidString("(*)");
        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final var result = solution.checkValidString("(*))");
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final var result = solution.checkValidString("(");
        assertThat(result).isFalse();
    }

    @Test
    void example_5() {
        final var result = solution.checkValidString(")");
        assertThat(result).isFalse();
    }

    @Test
    void example_6() {
        final var result = solution.checkValidString("(*");
        assertThat(result).isTrue();
    }

    @Test
    void example_7() {
        final var result = solution.checkValidString("*)");
        assertThat(result).isTrue();
    }

    @Test
    void example_8() {
        final var result = solution.checkValidString("*(");
        assertThat(result).isFalse();
    }

    @Test
    void example_9() {
        final var result = solution.checkValidString(")(");
        assertThat(result).isFalse();
    }

    @Test
    void example_10() {
        final var result = solution.checkValidString("*((())");
        assertThat(result).isFalse();
    }

    @Test
    void example_11() {
        final var result = solution.checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())");
        assertThat(result).isFalse();
    }
}
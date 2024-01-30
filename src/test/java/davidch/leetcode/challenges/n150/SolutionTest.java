package davidch.leetcode.challenges.n150;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] tokens = {"2", "1", "+", "3", "*"};
        final var result = solution.evalRPN(tokens);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_2() {
        final String[] tokens = {"4", "13", "5", "/", "+"};
        final var result = solution.evalRPN(tokens);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        final var result = solution.evalRPN(tokens);
        assertThat(result).isEqualTo(22);
    }
}
package davidch.leetcode.challenges.n990;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] equations = {"a==b", "b!=a"};
        final var result = solution.equationsPossible(equations);
        assertThat(result).isFalse();
    }

    @Test
    void example_2() {
        final String[] equations = {"b==a", "a==b"};
        final var result = solution.equationsPossible(equations);
        assertThat(result).isTrue();
    }

    @Test
    void non_equality_defined_first() {
        final String[] equations = {"b!=a", "a==b"};
        final var result = solution.equationsPossible(equations);
        assertThat(result).isFalse();
    }
}
package davidch.leetcode.challenges.n344;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final char[] s = {'h','e','l','l','o'};
        final char[] expected = {'o','l','l','e','h'};
        solution.reverseString(s);

        assertThat(s).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        final char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        solution.reverseString(s);

        assertThat(s).isEqualTo(expected);
    }
}
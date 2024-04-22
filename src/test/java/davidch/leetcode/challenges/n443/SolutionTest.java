package davidch.leetcode.challenges.n443;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        final var result = solution.compress(chars);
        final char[] expectedChars = {'a', '2', 'b', '2', 'c', '3', 'c'};
        assertThat(chars).isEqualTo(expectedChars);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final char[] chars = {'a'};
        final var result = solution.compress(chars);
        final char[] expectedChars = {'a'};
        assertThat(chars).isEqualTo(expectedChars);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        final var result = solution.compress(chars);
        final char[] expectedChars = {'a', 'b', '1', '2', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertThat(chars).isEqualTo(expectedChars);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_4() {
        final char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        final var result = solution.compress(chars);
        final char[] expectedChars = {'a', 'b', '1', '0', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertThat(chars).isEqualTo(expectedChars);
        assertThat(result).isEqualTo(4);
    }
}
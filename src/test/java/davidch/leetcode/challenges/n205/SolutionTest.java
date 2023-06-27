package davidch.leetcode.challenges.n205;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.isIsomorphic("egg", "add");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.isIsomorphic("foo", "bar");
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.isIsomorphic("paper", "title");
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final var result = solution.isIsomorphic("badc", "baba");
        assertThat(result).isFalse();
    }
}
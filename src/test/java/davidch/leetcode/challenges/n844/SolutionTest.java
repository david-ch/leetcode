package davidch.leetcode.challenges.n844;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.backspaceCompare("ab#c", "ad#c");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.backspaceCompare("ab##", "c#d#");
        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final var result = solution.backspaceCompare("a#c", "b");
        assertThat(result).isFalse();
    }
}
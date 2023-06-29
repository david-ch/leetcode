package davidch.leetcode.challenges.n1657;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.closeStrings("abc", "bca");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.closeStrings("a", "aa");
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.closeStrings("cabbba", "abbccc");
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final var result = solution.closeStrings("abbzccca", "babzzczc");
        assertThat(result).isTrue();
    }
}
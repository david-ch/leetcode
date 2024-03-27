package davidch.leetcode.challenges.n345;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.reverseVowels("hello");
        assertThat(result).isEqualTo("holle");
    }

    @Test
    void example_2() {
        final var result = solution.reverseVowels("leetcode");
        assertThat(result).isEqualTo("leotcede");
    }
}
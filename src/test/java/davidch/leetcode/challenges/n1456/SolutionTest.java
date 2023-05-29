package davidch.leetcode.challenges.n1456;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxVowels("abciiidef", 3);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.maxVowels("aeiou", 2);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final var result = solution.maxVowels("leetcode", 3);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_4() {
        final var result = solution.maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33);

        assertThat(result).isEqualTo(7);
    }
}
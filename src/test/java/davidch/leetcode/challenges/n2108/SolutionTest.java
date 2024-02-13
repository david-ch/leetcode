package davidch.leetcode.challenges.n2108;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final String[] words = {"abc", "car", "ada", "racecar", "cool"};
        final var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo("ada");
    }

    @Test
    void example_2() {
        final String[] words = {"notapalindrome", "racecar"};
        final var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo("racecar");
    }

    @Test
    void example_3() {
        final String[] words = {"def", "ghi"};
        final var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo("");
    }

    @Test
    void example_4() {
        final String[] words = {"po", "zsz"};
        final var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo("zsz");
    }

    @Test
    void example_5() {
        final String[] words = {"cqllrtyhw", "swwisru", "gpzmbders", "wqibjuqvs", "pp", "usewxryy", "ybqfuh", "hqwwqftgyu", "jggmatpk"};
        final var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo("pp");
    }

    @Test
    void example_6() {
        final String[] words = {"a"};
        final var result = solution.firstPalindrome(words);
        assertThat(result).isEqualTo("a");
    }
}
package davidch.leetcode.challenges.n125;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.isPalindrome("A man, a plan, a canal: Panama");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.isPalindrome("race a car");
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.isPalindrome(" ");
        assertThat(result).isTrue();
    }

    @Test
    void example_4() {
        final var result = solution.isPalindrome("0P");
        assertThat(result).isFalse();
    }

    @Test
    void example_5() {
        final var result = solution.isPalindrome("5 95");
        assertThat(result).isTrue();
    }
}
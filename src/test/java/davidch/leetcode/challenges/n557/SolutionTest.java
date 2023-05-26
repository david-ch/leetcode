package davidch.leetcode.challenges.n557;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.reverseWords("Let's take LeetCode contest");

        assertThat(result).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    void example_2() {
        final var result = solution.reverseWords("God Ding");

        assertThat(result).isEqualTo("doG gniD");
    }
}
package davidch.leetcode.challenges.n2390;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.removeStars("leet**cod*e");
        assertThat(result).isEqualTo("lecoe");
    }

    @Test
    void example_2() {
        final var result = solution.removeStars("erase*****");
        assertThat(result).isEqualTo("");
    }
}
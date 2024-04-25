package davidch.leetcode.challenges.n2370;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.longestIdealString("acfgbd", 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.longestIdealString("abcd", 3);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final var result = solution.longestIdealString("pvjcci", 4);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_4() {
        final var result = solution.longestIdealString("acfgbd", 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_5() {
        final var result = solution.longestIdealString("eduktdb", 15);
        assertThat(result).isEqualTo(5);
    }
}
package davidch.leetcode.challenges.n1544;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.makeGood("leEeetcode");
        assertThat(result).isEqualTo("leetcode");
    }

    @Test
    void example_2() {
        final var result = solution.makeGood("abBAcC");
        assertThat(result).isEqualTo("");
    }

    @Test
    void example_3() {
        final var result = solution.makeGood("s");
        assertThat(result).isEqualTo("s");
    }

    @Test
    void example_4() {
        final var result = solution.makeGood("kkdsFuqUfSDKK");
        assertThat(result).isEqualTo("kkdsFuqUfSDKK");
    }
}
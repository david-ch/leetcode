package davidch.leetcode.challenges.n2182;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.repeatLimitedString("cczazcc", 3);
        assertThat(result).isEqualTo("zzcccac");
    }

    @Test
    void example_2() {
        final var result = solution.repeatLimitedString("aababab", 2);
        assertThat(result).isEqualTo("bbabaa");
    }
}
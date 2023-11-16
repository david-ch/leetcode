package davidch.leetcode.challenges.n1663;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.getSmallestString(3, 27);
        assertThat(result).isEqualTo("aay");
    }

    @Test
    void example_2() {
        final var result = solution.getSmallestString(5, 73);
        assertThat(result).isEqualTo("aaszz");
    }
}
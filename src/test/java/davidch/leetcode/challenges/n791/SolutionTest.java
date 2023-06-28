package davidch.leetcode.challenges.n791;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.customSortString("cba", "abcd");
        assertThat(result).isEqualTo("dcba");
    }

    @Test
    void example_2() {
        final var result = solution.customSortString("cbafg", "abcd");
        assertThat(result).isEqualTo("dcba");
    }
}
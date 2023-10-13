package davidch.leetcode.challenges.n1433;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.checkIfCanBreak("abc", "xya");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.checkIfCanBreak("abe", "acd");
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.checkIfCanBreak("leetcodee", "interview");
        assertThat(result).isTrue();
    }
}
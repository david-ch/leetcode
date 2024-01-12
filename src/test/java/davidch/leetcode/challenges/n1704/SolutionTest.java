package davidch.leetcode.challenges.n1704;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.halvesAreAlike("book");
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.halvesAreAlike("textbook");
        assertThat(result).isFalse();
    }
}
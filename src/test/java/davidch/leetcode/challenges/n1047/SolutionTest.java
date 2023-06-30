package davidch.leetcode.challenges.n1047;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.removeDuplicates("abbaca");
        assertThat(result).isEqualTo("ca");
    }

    @Test
    void example_2() {
        final var result = solution.removeDuplicates("azxxzy");
        assertThat(result).isEqualTo("ay");
    }
}
package davidch.leetcode.challenges.n1614;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maxDepth("(1+(2*3)+((8)/4))+1");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.maxDepth("(1)+((2))+(((3)))");
        assertThat(result).isEqualTo(3);
    }
}
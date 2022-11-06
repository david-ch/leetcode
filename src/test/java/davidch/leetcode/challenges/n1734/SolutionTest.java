package davidch.leetcode.challenges.n1734;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.decode(new int[]{3, 1});

        assertThat(result).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    void example_2() {
        final var result = solution.decode(new int[]{6, 5, 4, 6});

        assertThat(result).isEqualTo(new int[]{2, 4, 1, 5, 3});
    }
}
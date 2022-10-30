package davidch.leetcode.challenges.n1672;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var input = new int[][]{
                new int[]{1, 2, 3},
                new int[]{3, 2, 1}
        };

        final var result = solution.maximumWealth(input);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final var input = new int[][]{
                new int[]{1, 5},
                new int[]{7, 3},
                new int[]{3, 5}
        };

        final var result = solution.maximumWealth(input);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void example_3() {
        final var input = new int[][]{
                new int[]{2, 8, 7},
                new int[]{7, 1, 3},
                new int[]{1, 9, 5}
        };

        final var result = solution.maximumWealth(input);

        assertThat(result).isEqualTo(17);
    }
}
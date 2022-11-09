package davidch.leetcode.challenges.n904;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] input = {1, 2, 1};

        final var result = solution.totalFruit(input);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] input = {0, 1, 2, 2};

        final var result = solution.totalFruit(input);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[] input = {1, 2, 3, 2, 2};

        final var result = solution.totalFruit(input);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_4() {
        final int[] input = {0, 1};

        final var result = solution.totalFruit(input);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_5() {
        final int[] input = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

        final var result = solution.totalFruit(input);

        assertThat(result).isEqualTo(5);
    }
}
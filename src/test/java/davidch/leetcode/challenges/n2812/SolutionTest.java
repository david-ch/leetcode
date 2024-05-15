package davidch.leetcode.challenges.n2812;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var grid = List.of(
            List.of(1, 0, 0),
            List.of(0, 0, 0),
            List.of(0, 0, 1)
        );
        final var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final var grid = List.of(
            List.of(0, 0, 1),
            List.of(0, 0, 0),
            List.of(0, 0, 0)
        );
        final var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final var grid = List.of(
            List.of(0, 0, 0, 1),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(1, 0, 0, 0)
        );
        final var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(2);
    }


    @Test
    void example_4() {
        final var grid = List.of(
            List.of(0, 1, 1),
            List.of(0, 0, 1),
            List.of(1, 0, 0)
        );
        final var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(1);
    }
}
package davidch.leetcode.challenges.n2857;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var coordinates = List.of(
                List.of(1, 2),
                List.of(4, 2),
                List.of(1, 3),
                List.of(5, 2)
        );
        final var result = solution.countPairs(coordinates, 5);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var coordinates = List.of(
                List.of(1, 3),
                List.of(1, 3),
                List.of(1, 3),
                List.of(1, 3),
                List.of(1, 3)
        );
        final var result = solution.countPairs(coordinates, 0);
        assertThat(result).isEqualTo(10);
    }

}
package davidch.leetcode.challenges.n1436;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );

        final var result = solution.destCity(paths);
        assertThat(result).isEqualTo("Sao Paulo");
    }

    @Test
    void example_2() {
        final var paths = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A")
        );

        final var result = solution.destCity(paths);
        assertThat(result).isEqualTo("A");
    }

    @Test
    void example_3() {
        final var paths = List.of(List.of("A", "Z"));
        final var result = solution.destCity(paths);
        assertThat(result).isEqualTo("Z");
    }
}
package davidch.leetcode.challenges.n1557;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var edges = List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2));
        final var result = solution.findSmallestSetOfVertices(6, edges);
        assertThat(result).containsExactlyInAnyOrder(0, 3);
    }

    @Test
    void example_2() {
        final var edges = List.of(List.of(0, 1), List.of(2, 1), List.of(3, 1), List.of(1, 4), List.of(2, 4));
        final var result = solution.findSmallestSetOfVertices(5, edges);
        assertThat(result).containsExactlyInAnyOrder(0, 2, 3);
    }

    @Test
    void example_3() {
        final var edges = List.of(List.of(0, 1), List.of(3, 2), List.of(4, 1), List.of(2, 1), List.of(4, 2), List.of(3, 4), List.of(0, 2), List.of(4, 0));
        final var result = solution.findSmallestSetOfVertices(5, edges);
        assertThat(result).containsExactlyInAnyOrder(3);
    }

}
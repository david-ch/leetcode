package davidch.leetcode.challenges.n841;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var rooms = List.of(List.of(1), List.of(2), List.of(3), List.<Integer>of());
        final var result = solution.canVisitAllRooms(rooms);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var rooms = List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0));
        final var result = solution.canVisitAllRooms(rooms);
        assertThat(result).isFalse();
    }
}
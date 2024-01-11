package davidch.leetcode.challenges.n119;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.getRow(3);
        assertThat(result).isEqualTo(List.of(1, 3, 3, 1));
    }

    @Test
    void example_2() {
        final var result = solution.getRow(0);
        assertThat(result).isEqualTo(List.of(1));
    }

    @Test
    void example_3() {
        final var result = solution.getRow(1);
        assertThat(result).isEqualTo(List.of(1, 1));
    }
}
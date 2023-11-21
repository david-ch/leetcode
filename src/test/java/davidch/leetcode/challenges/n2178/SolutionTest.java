package davidch.leetcode.challenges.n2178;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.maximumEvenSplit(12);
        assertThat(result).isEqualTo(List.of(2L, 4L, 6L));
    }

    @Test
    void example_2() {
        final var result = solution.maximumEvenSplit(7);
        assertThat(result).isEqualTo(List.of());
    }

    @Test
    void example_3() {
        final var result = solution.maximumEvenSplit(28);
        assertThat(result).isEqualTo(List.of(4L, 6L, 8L, 10L));
    }
}
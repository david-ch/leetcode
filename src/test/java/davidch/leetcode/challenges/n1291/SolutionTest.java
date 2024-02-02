package davidch.leetcode.challenges.n1291;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.sequentialDigits(100, 300);
        assertThat(result).isEqualTo(List.of(123, 234));
    }

    @Test
    void example_2() {
        final var result = solution.sequentialDigits(1000, 13000);
        assertThat(result).isEqualTo(List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345));
    }

    @Test
    void example_3() {
        final var result = solution.sequentialDigits(10, 12);
        assertThat(result).isEqualTo(List.of(12));
    }

    @Test
    void example_4() {
        final var result = solution.sequentialDigits(78, 89);
        assertThat(result).isEqualTo(List.of(78, 89));
    }
}
package davidch.leetcode.challenges.n118;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.generate(5);
        assertThat(result).isEqualTo(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        ));
    }

    @Test
    void example_2() {
        final var result = solution.generate(1);
        assertThat(result).isEqualTo(List.of(
                List.of(1)
        ));
    }
}
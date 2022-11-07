package davidch.leetcode.challenges.n78;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var input = new int[]{1, 2, 3};
        final var result = solution.subsets(input);

        assertThat(result).containsExactlyInAnyOrder(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(3),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
    }

    @Test
    void example_2() {
        final var input = new int[]{0};
        final var result = solution.subsets(input);

        assertThat(result).containsExactlyInAnyOrder(
                List.of(),
                List.of(0)
        );
    }

    @Test
    void longer_example() {
        final var input = new int[]{1, 2, 3, 4};
        final var result = solution.subsets(input);

        assertThat(result).containsExactlyInAnyOrder(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(4),
                List.of(1, 2),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3),
                List.of(2, 4),
                List.of(3, 4),
                List.of(1, 2, 3),
                List.of(1, 2, 4),
                List.of(1, 3, 4),
                List.of(2, 3, 4),
                List.of(1, 2, 3, 4)
        );
    }
}
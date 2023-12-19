package davidch.leetcode.challenges.n120;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        final var result = solution.minimumTotal(triangle);
        assertThat(result).isEqualTo(11);
    }

    @Test
    void example_2() {
        final var triangle = Arrays.asList(
                Arrays.asList(-10)
        );
        final var result = solution.minimumTotal(triangle);
        assertThat(result).isEqualTo(-10);
    }
}
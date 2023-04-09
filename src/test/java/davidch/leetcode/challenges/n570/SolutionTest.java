package davidch.leetcode.challenges.n570;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var result = solution.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11});

        assertThat(result).isEqualTo(10);
    }
}
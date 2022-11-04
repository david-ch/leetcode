package davidch.leetcode.challenges.n876;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.n876.Solution.linkedListFrom;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var input = linkedListFrom(1, 2, 3, 4, 5);

        final var result = solution.middleNode(input);

        assertThat(result).isEqualTo(linkedListFrom(3, 4, 5));
    }

    @Test
    void example_2() {
        final var input = linkedListFrom(1, 2, 3, 4, 5, 6);

        final var result = solution.middleNode(input);

        assertThat(result).isEqualTo(linkedListFrom(4, 5, 6));
    }
}
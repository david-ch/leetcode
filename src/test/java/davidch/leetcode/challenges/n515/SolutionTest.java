package davidch.leetcode.challenges.n515;

import org.junit.jupiter.api.Test;

import java.util.List;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 3, 2, 5, 3, null, 9);
        final var expectedResult = List.of(1, 3, 9);
        final var result = solution.largestValues(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var root = tree(1, 2, 3);
        final var expectedResult = List.of(1, 3);
        final var result = solution.largestValues(root);
        assertThat(result).isEqualTo(expectedResult);
    }
}
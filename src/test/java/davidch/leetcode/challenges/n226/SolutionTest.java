package davidch.leetcode.challenges.n226;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(4, 2, 7, 1, 3, 6, 9);
        final var expectedResult = tree(4, 7, 2, 9, 6, 3, 1);
        final var result = solution.invertTree(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final var root = tree(2, 1, 3);
        final var expectedResult = tree(2, 3, 1);
        final var result = solution.invertTree(root);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final var result = solution.invertTree(null);
        assertThat(result).isNull();
    }
}
package davidch.leetcode.challenges.n543;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(1, 2, 3, 4, 5);
        final var result = solution.diameterOfBinaryTree(root);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var root = tree(1, 2);
        final var result = solution.diameterOfBinaryTree(root);
        assertThat(result).isEqualTo(1);
    }
}
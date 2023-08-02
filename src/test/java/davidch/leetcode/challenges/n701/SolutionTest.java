package davidch.leetcode.challenges.n701;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(4, 2, 7, 1, 3);
        final var result = solution.insertIntoBST(root, 5);
        assertThat(result).isEqualTo(tree(4, 2, 7, 1, 3, 5));
    }

    @Test
    void example_2() {
        final var root = tree(40, 20, 60, 10, 30, 50, 70);
        final var result = solution.insertIntoBST(root, 25);
        assertThat(result).isEqualTo(tree(40, 20, 60, 10, 30, 50, 70, null, null, 25));
    }

    @Test
    void example_3() {
        final var root = tree(4, 2, 7, 1, 3, null, null, null, null, null, null);
        final var result = solution.insertIntoBST(root, 5);
        assertThat(result).isEqualTo(tree(4, 2, 7, 1, 3, 5));
    }
}
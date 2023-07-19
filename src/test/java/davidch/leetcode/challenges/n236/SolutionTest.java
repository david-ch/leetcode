package davidch.leetcode.challenges.n236;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.leaf;
import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        final var result = solution.lowestCommonAncestor(root, leaf(5), leaf(1));
        assertThat(result.val).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var root = tree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        final var result = solution.lowestCommonAncestor(root, leaf(5), leaf(4));
        assertThat(result.val).isEqualTo(5);
    }

    @Test
    void example_3() {
        final var root = tree(1, 2);
        final var result = solution.lowestCommonAncestor(root, leaf(1), leaf(2));
        assertThat(result.val).isEqualTo(1);
    }
}
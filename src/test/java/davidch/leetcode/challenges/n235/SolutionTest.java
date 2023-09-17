package davidch.leetcode.challenges.n235;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.find;
import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        final var p = find(root, 2);
        final var q = find(root, 8);
        final var result = solution.lowestCommonAncestor(root, p, q);
        assertThat(result).isEqualTo(find(root, 6));
    }

    @Test
    void example_2() {
        final var root = tree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        final var p = find(root, 2);
        final var q = find(root, 4);
        final var result = solution.lowestCommonAncestor(root, p, q);
        assertThat(result).isEqualTo(find(root, 2));
    }

    @Test
    void example_3() {
        final var root = tree(2, 1);
        final var p = find(root, 2);
        final var q = find(root, 1);
        final var result = solution.lowestCommonAncestor(root, p, q);
        assertThat(result).isEqualTo(find(root, 2));
    }
}
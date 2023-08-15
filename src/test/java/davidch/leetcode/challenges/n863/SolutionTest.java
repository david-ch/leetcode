package davidch.leetcode.challenges.n863;

import davidch.leetcode.challenges.common.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.binarytree.TreeNode.tree;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var root = tree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        final var target = find(root, 5);
        final var result = solution.distanceK(root, target, 2);
        assertThat(result).containsExactlyInAnyOrder(7, 4, 1);
    }

    @Test
    void example_2() {
        final var root = tree(1);
        final var target = find(root, 1);
        final var result = solution.distanceK(root, target, 3);
        assertThat(result).isEmpty();
    }

    @Test
    void example_3() {
        final var root = tree(0, 1, null, 3, 2);
        final var target = find(root, 2);
        final var result = solution.distanceK(root, target, 1);
        assertThat(result).containsExactlyInAnyOrder(1);
    }

    @Test
    void example_4() {
        final var root = tree(0, 1, 2, null, 3, null, 5, 4);
        final var target = find(root, 3);
        final var result = solution.distanceK(root, target, 3);
        assertThat(result).containsExactlyInAnyOrder(2);
    }


    private static TreeNode find(TreeNode root, int value) {
        if (root == null) return null;
        if (root.val == value) return root;
        final var leftSubtreeResult = find(root.left, value);
        return leftSubtreeResult == null ? find(root.right, value) : leftSubtreeResult;
    }
}
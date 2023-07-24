package davidch.leetcode.challenges.n1026;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return maxAncestorDiff(root, root.val, root.val);
    }

    private int maxAncestorDiff(TreeNode root, int min, int max) {
        if (root == null) return 0;

        final var newMin = Math.min(min, root.val);
        final var newMax = Math.max(max, root.val);

        return Math.max(
                Math.max(Math.abs(root.val - max), Math.abs(root.val - min)),
                Math.max(maxAncestorDiff(root.left, newMin, newMax), maxAncestorDiff(root.right, newMin, newMax))
        );
    }
}

package davidch.leetcode.challenges.n1448;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val - 1);
    }

    private int goodNodes(TreeNode root, int currentMax) {
        if (root == null) return 0;

        final var newMax = Math.max(currentMax, root.val);
        return (root.val >= currentMax ? 1 : 0) + goodNodes(root.left, newMax) + goodNodes(root.right, newMax);
    }
}

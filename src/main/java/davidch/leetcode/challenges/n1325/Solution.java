package davidch.leetcode.challenges.n1325;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        final var beforeRoot = new TreeNode(-1, root, null);
        shouldRemove(beforeRoot, target);
        return beforeRoot.left;
    }

    private boolean shouldRemove(TreeNode node, int target) {
        if (node == null) return false;
        if (shouldRemove(node.left, target)) node.left = null;
        if (shouldRemove(node.right, target)) node.right = null;
        return node.val == target && node.left == null && node.right == null;
    }
}

package davidch.leetcode.challenges.n450;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            final var min = removeMin(root.right);
            if (min == root.right.val) root.right = root.right.right;
            root.val = min;
        }
        else if (root.val > key) root.left = deleteNode(root.left, key);
        else root.right = deleteNode(root.right, key);

        return root;
    }

    private int removeMin(TreeNode node) {
        if (node.left == null) return node.val;

        final var min = removeMin(node.left);
        if (min == node.left.val) node.left = node.left.right;
        return min;
    }
}

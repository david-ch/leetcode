package davidch.leetcode.challenges.n623;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null) return null;
        if (depth == 1) return new TreeNode(val, root, null);
        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
            return root;
        }

        addOneRow(root.left, val, depth - 1);
        addOneRow(root.right, val, depth - 1);
        return root;
    }
}

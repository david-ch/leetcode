package davidch.leetcode.challenges.n129;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return sumOfLeaves(root, 0);
    }

    public int sumOfLeaves(TreeNode root, int prefix) {
        if (root == null) return 0;
        prefix = prefix * 10 + root.val;
        if (root.left == null && root.right == null) return prefix;
        return sumOfLeaves(root.left, prefix) + sumOfLeaves(root.right, prefix);
    }
}

package davidch.leetcode.challenges.n101;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return areEqual(root.left, root.right);
    }

    private boolean areEqual(TreeNode left, TreeNode right) {
        return (left == null && right == null)
                || (left != null && right != null && left.val == right.val
                && areEqual(left.left, right.right) && areEqual(left.right, right.left));
    }
}

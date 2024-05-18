package davidch.leetcode.challenges.n979;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {

    private int result = 0;

    public int distributeCoins(TreeNode root) {
        balance(root);
        return result;
    }

    public int balance(TreeNode root) {
        if (root == null) return 0;
        final var left = balance(root.left);
        final var right = balance(root.right);
        result += Math.abs(left);
        result += Math.abs(right);
        return left + right + root.val - 1;
    }
}

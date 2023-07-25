package davidch.leetcode.challenges.n543;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return measure(root).diameter;
    }

    private TreeMeasurement measure(TreeNode root) {
        if (root == null) return new TreeMeasurement(0, 0);

        final var left = measure(root.left);
        final var right = measure(root.right);

        return new TreeMeasurement(
            1 + Math.max(left.depth, right.depth),
            Math.max(Math.max(left.depth + right.depth, left.diameter), right.diameter)
        );
    }

    record TreeMeasurement(int depth, int diameter) {
    }
}

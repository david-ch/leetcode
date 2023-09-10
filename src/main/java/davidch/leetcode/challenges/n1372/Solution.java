package davidch.leetcode.challenges.n1372;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int longestZigZag(TreeNode root) {
        return Math.max(
                longestZigZag(root, 0, false),
                longestZigZag(root, 0, true)
        ) - 1;
    }

    public int longestZigZag(TreeNode node, int currentDepth, boolean reverse) {
        if (node == null) return currentDepth;

        currentDepth++;

        return Math.max(
                longestZigZag(node.left, reverse ? currentDepth : 1, false),
                longestZigZag(node.right, reverse ? 1 : currentDepth, true)
        );
    }
}

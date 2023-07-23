package davidch.leetcode.challenges.n111;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) {
            if (root.right == null) return 1;
            return 1 + minDepth(root.right);
        } else {
            if (root.right == null) return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

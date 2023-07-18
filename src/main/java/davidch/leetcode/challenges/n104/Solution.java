package davidch.leetcode.challenges.n104;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

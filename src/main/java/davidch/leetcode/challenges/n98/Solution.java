package davidch.leetcode.challenges.n98;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidSubtree(root, null, null);
    }

    private boolean isValidSubtree(TreeNode root, Integer allowedMin, Integer allowedMax) {
        return root == null ||
                (allowedMin == null || root.val > allowedMin) &&
                (allowedMax == null || root.val < allowedMax) &&
                isValidSubtree(root.left, allowedMin, root.val) &&
                isValidSubtree(root.right, root.val, allowedMax);
    }
}

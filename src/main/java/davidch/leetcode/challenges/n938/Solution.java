package davidch.leetcode.challenges.n938;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        var result = 0;
        if (root.val >= low && root.val <= high) result += root.val;
        if (root.val >= low) result += rangeSumBST(root.left, low, high);
        if (root.val <= high) result += rangeSumBST(root.right, low, high);
        return result;
    }
}

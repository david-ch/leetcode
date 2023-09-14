package davidch.leetcode.challenges.n700;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) return root;
        if (root.val > val) return root.left == null ? null : searchBST(root.left, val);
        return root.right == null ? null : searchBST(root.right, val);
    }
}

package davidch.leetcode.challenges.n226;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        final var leftSubtree = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(leftSubtree);
        return root;
    }
}

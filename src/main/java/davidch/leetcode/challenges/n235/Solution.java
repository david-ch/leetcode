package davidch.leetcode.challenges.n235;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) return root;

        final var r = lowestCommonAncestor(root.left, p, q);
        final var l = lowestCommonAncestor(root.right, p, q);

        if (r != null) return l != null ? root : r;
        else return l;
    }
}

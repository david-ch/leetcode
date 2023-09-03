package davidch.leetcode.challenges.n872;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;

public class Solution {


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        final var root1Leaves = new ArrayList<Integer>();
        final var root2Leaves = new ArrayList<Integer>();
        collectLeaves(root1, root1Leaves);
        collectLeaves(root2, root2Leaves);

        return root1Leaves.equals(root2Leaves);
    }

    private void collectLeaves(TreeNode node, ArrayList<Integer> leaves) {
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }

        if (node.left != null) collectLeaves(node.left, leaves);
        if (node.right != null) collectLeaves(node.right, leaves);
    }
}

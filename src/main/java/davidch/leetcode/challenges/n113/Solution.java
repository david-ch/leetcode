package davidch.leetcode.challenges.n113;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        visit(new int[depth(root)], 0, root, targetSum);
        return result;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(depth(node.left), depth(node.right));
    }

    private void visit(int[] path, int pathIdx, TreeNode node, int targetSum) {
        if (node == null) return;

        path[pathIdx] = node.val;
        pathIdx++;
        final var currentSum = targetSum - node.val;

        if (currentSum == 0 && node.left == null && node.right == null) {
            final var r = new ArrayList<Integer>(pathIdx);
            for (var i = 0; i < pathIdx; i++) {
                r.add(path[i]);
            }
            result.add(r);
        }

        visit(path, pathIdx, node.left,  currentSum);
        visit(path, pathIdx, node.right, currentSum);
    }
}

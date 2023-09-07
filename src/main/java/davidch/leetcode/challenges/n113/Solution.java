package davidch.leetcode.challenges.n113;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        visit(new ArrayList<>(), root, targetSum);
        return result;
    }

    private void visit(List<Integer> path, TreeNode node, int targetSum) {
        if (node == null) return;

        path.add(node.val);
        final var currentSum = targetSum - node.val;

        if (currentSum == 0 && node.left == null && node.right == null)
            result.add(new ArrayList<>(path));

        visit(path, node.left,  currentSum);
        visit(path, node.right, currentSum);
        path.remove(path.size() - 1);
    }
}

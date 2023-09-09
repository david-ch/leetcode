package davidch.leetcode.challenges.n437;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final Map<Long, Integer> sumCounts = new HashMap<>();
    private int result = 0;

    public int pathSum(TreeNode root, int targetSum) {
        sumCounts.put(0L, 1);
        countPaths(root, 0, targetSum);
        return result;
    }

    private void countPaths(TreeNode node, long currentSum, int targetSum) {
        if (node == null) return;

        currentSum += node.val;
        if (sumCounts.containsKey(currentSum - targetSum)) result += sumCounts.get(currentSum - targetSum);

        sumCounts.put(currentSum, sumCounts.getOrDefault(currentSum, 0) + 1);
        countPaths(node.left, currentSum, targetSum);
        countPaths(node.right, currentSum, targetSum);
        sumCounts.put(currentSum, sumCounts.get(currentSum) - 1);
    }
}

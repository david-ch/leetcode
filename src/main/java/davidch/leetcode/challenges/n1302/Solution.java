package davidch.leetcode.challenges.n1302;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();

        currentLevel.add(root);
        var currentLevelSum = 0;
        while (!currentLevel.isEmpty()) {
            final var node = currentLevel.poll();
            currentLevelSum += node.val;

            if (node.left != null) nextLevel.offer(node.left);
            if (node.right != null) nextLevel.offer(node.right);

            if (currentLevel.isEmpty() && !nextLevel.isEmpty()) {
                final var buf = currentLevel;
                currentLevel = nextLevel;
                nextLevel = buf;
                currentLevelSum = 0;
            }
        }

        return currentLevelSum;
    }
}

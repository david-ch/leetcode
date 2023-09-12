package davidch.leetcode.challenges.n1161;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        int resultLevel = 1;
        int resultSum = root.val;

        final Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        var currentLevel = 1;

        while (!q.isEmpty()) {
            var currentSum = 0;
            for (var i = q.size(); i > 0; i--) {
                final var node = q.poll();
                currentSum += node.val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            if (currentSum > resultSum) {
                resultLevel = currentLevel;
                resultSum = currentSum;
            }

            currentLevel++;
        }

        return resultLevel;
    }
}

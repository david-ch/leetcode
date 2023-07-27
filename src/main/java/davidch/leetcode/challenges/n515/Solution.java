package davidch.leetcode.challenges.n515;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();

        if (root != null) currentLevel.offer(root);

        final List<Integer> result = new ArrayList<>();
        var max = Integer.MIN_VALUE;
        while (!currentLevel.isEmpty()) {
            final var node = currentLevel.poll();
            max = Math.max(node.val, max);
            if (node.left != null) nextLevel.offer(node.left);
            if (node.right != null) nextLevel.offer(node.right);

            if (currentLevel.isEmpty()) {
                var buf = currentLevel;
                currentLevel = nextLevel;
                nextLevel = buf;

                result.add(max);
                max = Integer.MIN_VALUE;
            }
        }

        return result;
    }
}

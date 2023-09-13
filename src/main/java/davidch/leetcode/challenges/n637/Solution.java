package davidch.leetcode.challenges.n637;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        final var result = new ArrayList<Double>();
        final Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            var sum = 0d;
            final var elementsNumber = q.size();

            for (var i = elementsNumber; i > 0; i--) {
                final var node = q.poll();
                sum += node.val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            result.add(sum / elementsNumber);
        }

        return result;
    }
}

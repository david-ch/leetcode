package davidch.leetcode.challenges.n102;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();

        final Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        final var result = new ArrayList<List<Integer>>();
        var level = new ArrayList<Integer>();

        while (!q.isEmpty()) {
            for (var i = q.size(); i > 0; i--) {
                final var node = q.poll();
                level.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            result.add(level);
            level = new ArrayList<>();
        }

        return result;
    }
}

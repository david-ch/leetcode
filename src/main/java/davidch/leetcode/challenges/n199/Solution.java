package davidch.leetcode.challenges.n199;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        final var result = new ArrayList<Integer>();
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();

        if (root != null) currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            final var node = currentLevel.poll();
            if (node.left != null) nextLevel.offer(node.left);
            if (node.right != null) nextLevel.offer(node.right);

            if (currentLevel.isEmpty()) {
                final var buf = currentLevel;
                currentLevel = nextLevel;
                nextLevel = buf;
                result.add(node.val);
            }
        }

        return result;
    }
}

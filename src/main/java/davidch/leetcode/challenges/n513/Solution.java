package davidch.leetcode.challenges.n513;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.LinkedList;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        final var q = new LinkedList<TreeNode>();
        var currentLevelSize = 1;
        var nextLevelSize = 0;
        q.add(root);

        var result = root.val;

        while (!q.isEmpty()) {
            final var node = q.poll();
            if (currentLevelSize == 0) {
                currentLevelSize = nextLevelSize;
                nextLevelSize = 0;
                result = node.val;
            }

            currentLevelSize--;
            if (node.left != null) {
                q.add(node.left);
                nextLevelSize++;
            }
            if (node.right != null) {
                q.add(node.right);
                nextLevelSize++;
            }
        }

        return result;
    }
}

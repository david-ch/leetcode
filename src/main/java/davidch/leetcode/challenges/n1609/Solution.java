package davidch.leetcode.challenges.n1609;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        final Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        var increasingOdd = true;

        while (!q.isEmpty()) {
            var previousValue = -1;
            for (var i = q.size(); i > 0; i--) {
                final var node = q.poll();
                final var isOdd = node.val % 2 == 1;
                if ((increasingOdd && (!isOdd || (previousValue != -1 && node.val <= previousValue)))
                        || (!increasingOdd && (isOdd || (previousValue != -1 && node.val >= previousValue))))
                    return false;

                previousValue = node.val;
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            increasingOdd = !increasingOdd;
        }

        return true;
    }
}

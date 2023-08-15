package davidch.leetcode.challenges.n863;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.*;

public class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        final var result = new ArrayList<Integer>();
        getChildrenAtDistance(target, k, null, result);

        final var pathToTarget = pathToTarget(root, target);
        while (pathToTarget.size() > k + 1) pathToTarget.pop();

        while (pathToTarget.size() > 1) {
            final var dist = k - pathToTarget.size() + 1;
            getChildrenAtDistance(pathToTarget.pop(), dist, pathToTarget.peek(), result);
        }

        return result;
    }

    private void getChildrenAtDistance(TreeNode node, int dist, TreeNode prohibitedChild, ArrayList<Integer> result) {
        final Queue<TreeNode> queue = new LinkedList<>();
        var currentLevelSize = 1;
        var nextLevelSize = 0;

        queue.add(node);

        for (int i = 0; i < dist; i++) {
            while (currentLevelSize > 0) {
                final var n = queue.poll();
                currentLevelSize--;

                if (n.left != null && n.left != prohibitedChild) {
                    queue.offer(n.left);
                    nextLevelSize++;
                }
                if (n.right != null && n.right != prohibitedChild) {
                    queue.offer(n.right);
                    nextLevelSize++;
                }
            }

            currentLevelSize = nextLevelSize;
            nextLevelSize = 0;
        }

        while (!queue.isEmpty()) result.add(queue.poll().val);
    }

    private Stack<TreeNode> pathToTarget(TreeNode root, TreeNode target) {
        if (root == target) {
            final var result = new Stack<TreeNode>();
            result.add(target);
            return result;
        }

        final var leftResult = root.left == null ? null : pathToTarget(root.left, target);
        if (leftResult != null) {
            leftResult.add(root);
            return leftResult;
        }

        final var rightResult = root.right == null ? null : pathToTarget(root.right, target);
        if (rightResult != null) {
            rightResult.add(root);
            return rightResult;
        }

        return null;
    }
}

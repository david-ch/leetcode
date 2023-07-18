package davidch.leetcode.challenges.common.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode tree(int val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }

    public static TreeNode leaf(int val) {
        return new TreeNode(val);
    }

    public static TreeNode tree(Integer... vals) {
        if (vals.length == 0) return null;

        final Queue<TreeNode> nodes = new LinkedList<>();
        final var root = leaf(vals[0]);
        nodes.offer(root);

        for (var i = 1; i < vals.length; i++) {
            final var node = nodes.poll();
            if (vals[i] != null) {
                node.left = leaf(vals[i]);
                nodes.offer(node.left);
            }
            i++;
            if (i < vals.length && vals[i] != null) {
                node.right = leaf(vals[i]);
                nodes.offer(node.right);
            }
        }

        return root;
    }
}
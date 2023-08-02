package davidch.leetcode.challenges.common.binarytree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
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
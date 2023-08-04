package davidch.leetcode.challenges.n94;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        final var stack = new Stack<TreeNode>();
        final var result = new ArrayList<Integer>();

        var node = root;
        while (node != null) {
            stack.push(node);
            if (node.left != null) {
                node = node.left;
                continue;
            }

            node = null;
            while (node == null && !stack.isEmpty()) {
                var parent = stack.pop();
                result.add(parent.val);
                node = parent.right;
            }
        }

        return result;
    }
}
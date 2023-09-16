package davidch.leetcode.challenges.n1305;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        final var traversal1 = new InorderTraversal(root1);
        final var traversal2 = new InorderTraversal(root2);

        final var result = new ArrayList<Integer>();
        while (traversal1.hasNext() || traversal2.hasNext()) {
            if (traversal2.hasNext() && (!traversal1.hasNext() || traversal1.peek() > traversal2.peek())) {
                result.add(traversal2.next());
            }
            else {
                result.add(traversal1.next());
            }
        }

        return result;
    }

    private static class InorderTraversal implements Iterator<Integer> {
        private final Stack<TreeNode> stack = new Stack<>();

        public InorderTraversal(TreeNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Integer next() {
            final var node = stack.pop();

            var toPush = node.right;
            while (toPush != null) {
                stack.push(toPush);
                toPush = toPush.left;
            }

            return node.val;
        }

        public Integer peek() {
            return stack.peek().val;
        }
    }
}

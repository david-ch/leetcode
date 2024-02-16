package davidch.leetcode.challenges.n117;

public class Solution {
    public Node connect(Node root) {
        connectChildren(root);
        connectMissing(root, null);
        return root;
    }

    public void connectChildren(Node node) {
        if (node == null) return;
        if (node.left != null && node.right != null) node.left.next = node.right;
        connectChildren(node.left);
        connectChildren(node.right);
    }

    public void connectMissing(Node node, Node parent) {
        if (node == null) return;
        if (node.next == null && parent != null) {
            if (parent.left == node && parent.right != null) node.next = parent.right;
            else {
                var p = parent.next;
                while (p != null) {
                    if (p.left != null) {
                        node.next = p.left;
                        break;
                    }
                    else if (p.right != null) {
                        node.next = p.right;
                        break;
                    }
                    p = p.next;
                }
            }
        }

        connectMissing(node.right, node);
        connectMissing(node.left, node);
    }

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}

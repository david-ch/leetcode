package davidch.leetcode.challenges.n145;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        final var result = new ArrayList<Integer>();
        collect(root, result);
        return result;
    }

    private void collect(TreeNode root, List<Integer> result) {
        if (root == null) return;
        if (root.left != null) collect(root.left, result);
        if (root.right != null) collect(root.right, result);
        result.add(root.val);
    }
}

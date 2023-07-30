package davidch.leetcode.challenges.n103;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        final var result = new ArrayList<List<Integer>>();
        var currentLevel = new Stack<TreeNode>();
        var nextLevel = new Stack<TreeNode>();
        var leftToRight = true;

        if (root != null) currentLevel.push(root);

        var currentLevelFlat = new ArrayList<Integer>();
        while (!currentLevel.isEmpty()) {
            final var node = currentLevel.pop();
            currentLevelFlat.add(node.val);

            if (leftToRight) {
                if (node.left != null) nextLevel.push(node.left);
                if (node.right != null) nextLevel.push(node.right);
            } else {
                if (node.right != null) nextLevel.push(node.right);
                if (node.left != null) nextLevel.push(node.left);
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                result.add(currentLevelFlat);
                currentLevelFlat = new ArrayList<>();

                final var buf = currentLevel;
                currentLevel = nextLevel;
                nextLevel = buf;
            }
        }

        return result;
    }

//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        final var result = new ArrayList<List<Integer>>();
//        final var currentLevel = new Stack<TreeNode>();
//        final var nextLevel = new Stack<TreeNode>();
//
//        if (root != null) currentLevel.push(root);
//
//        while (!currentLevel.isEmpty()) {
//            final var currentLevelFlat = new ArrayList<Integer>();
//            while (!currentLevel.isEmpty()) {
//                final var node = currentLevel.pop();
//                currentLevelFlat.add(node.val);
//                if (node.left != null) nextLevel.push(node.left);
//                if (node.right != null) nextLevel.push(node.right);
//            }
//            result.add(currentLevelFlat);
//
//            final var nextLevelFlat = new ArrayList<Integer>();
//            while (!nextLevel.isEmpty()) {
//                final var node = nextLevel.pop();
//                nextLevelFlat.add(node.val);
//                if (node.right != null) currentLevel.push(node.right);
//                if (node.left != null) currentLevel.push(node.left);
//            }
//            if (!nextLevelFlat.isEmpty()) result.add(nextLevelFlat);
//        }
//
//        return result;
//    }
}

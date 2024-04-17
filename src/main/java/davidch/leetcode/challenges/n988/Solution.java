package davidch.leetcode.challenges.n988;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

import java.util.Arrays;

public class Solution {

    private char[] max = new char[8501];
    private int maxLen = 0;
    private final char[] current = new char[8501];
    private int currentLen;

    public String smallestFromLeaf(TreeNode root) {
        traverse(root);
        for (var i = 0; i < maxLen / 2; i++) {
            final var temp = max[i];
            max[i] = max[maxLen - 1 - i];
            max[maxLen - 1 - i] = temp;
        }
        return new String(max, 0, maxLen);
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        current[currentLen] = (char) ('a' + root.val);
        currentLen++;

        if (root.left == null && root.right == null) {
            if (maxLen == 0) {
                max = Arrays.copyOf(current, 8501);
                maxLen = currentLen;
            } else {
                var ci = currentLen - 1;
                var mi = maxLen - 1;
                while (ci >= 0 && mi >= 0) {
                    if (current[ci] > max[mi]) break;
                    if (current[ci] < max[mi]) {
                        max = Arrays.copyOf(current, 8501);
                        maxLen = currentLen;
                        break;
                    }
                    ci--;
                    mi--;
                }

                if (ci == -1 && mi >= 0) {
                    max = Arrays.copyOf(current, 8501);
                    maxLen = currentLen;
                }
            }
        }

        traverse(root.left);
        traverse(root.right);
        currentLen--;
        current[currentLen] = 0;
    }
}

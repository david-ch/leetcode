package davidch.leetcode.challenges.n108;

import davidch.leetcode.challenges.common.binarytree.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }

    public TreeNode sortedArrayToBST(int[] nums, int from, int to) {
        if (from >= to) return null;

        final var mid = (from + to) / 2;

        return new TreeNode(
            nums[mid],
            sortedArrayToBST(nums, from, mid),
            sortedArrayToBST(nums, mid + 1, to)
        );
    }
}

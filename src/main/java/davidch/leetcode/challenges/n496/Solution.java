package davidch.leetcode.challenges.n496;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        final var numToNextGreater = new HashMap<Integer, Integer>();
        final var increasingNums = new Stack<Integer>();

        for (var i = nums2.length - 1; i >= 0; i--) {
            final var num = nums2[i];
            while (!increasingNums.empty() && increasingNums.peek() <= num) increasingNums.pop();
            numToNextGreater.put(num, increasingNums.empty() ? -1 : increasingNums.peek());
            increasingNums.push(num);
        }

        final var ans = new int[nums1.length];
        for (var i = 0; i < ans.length; i++) {
            ans[i] = numToNextGreater.get(nums1[i]);
        }

        return ans;
    }
}

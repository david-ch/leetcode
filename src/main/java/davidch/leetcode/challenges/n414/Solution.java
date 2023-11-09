package davidch.leetcode.challenges.n414;

import java.util.PriorityQueue;

public class Solution {
    public int thirdMax(int[] nums) {
        final var threeMaxNums = new PriorityQueue<Integer>();
        for (var num : nums) {
            if (threeMaxNums.contains(num)) continue;
            threeMaxNums.add(num);
            if (threeMaxNums.size() > 3) threeMaxNums.poll();
        }

        if (threeMaxNums.size() == 3) return threeMaxNums.poll();
        while (threeMaxNums.size() > 1) threeMaxNums.poll();
        return threeMaxNums.poll();
    }
}

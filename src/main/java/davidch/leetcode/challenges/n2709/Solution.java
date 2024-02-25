package davidch.leetcode.challenges.n2709;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

class Solution {
    private static final int REACHED = -1;

    public boolean canTraverseAllPairs(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 1) return false;

        final var checkedDivisors = new HashSet<Integer>();
        final Queue<Integer> nextSteps = new ArrayDeque<>();
        nextSteps.add(nums[0]);
        nums[0] = REACHED;
        var toReach = nums.length - 1;

        while (!nextSteps.isEmpty()) {
            final var num = nextSteps.poll();

            var tmp = num;
            var d = 2;
            while (d * d <= num) {
                if (tmp % d == 0) {
                    if (!checkedDivisors.contains(d)) {
                        checkedDivisors.add(d);

                        for (var i = 0; i < nums.length; i++) {
                            if (nums[i] == 1) return false;
                            if (nums[i] == REACHED || nums[i] % d != 0) continue;

                            toReach -= 1;
                            if (toReach == 0) return true;
                            nextSteps.add(nums[i]);
                            nums[i] = REACHED;
                        }
                    }

                    while (tmp % d == 0) tmp /= d;
                }
                d++;
            }

            if (tmp > 1 && !checkedDivisors.contains(tmp)) {
                checkedDivisors.add(tmp);

                for (var i = 0; i < nums.length; i++) {
                    if (nums[i] == 1) return false;
                    if (nums[i] == REACHED || nums[i] % tmp != 0) continue;

                    toReach -= 1;
                    if (toReach == 0) return true;
                    nextSteps.add(nums[i]);
                    nums[i] = REACHED;
                }
            }
        }

        return false;
    }
}

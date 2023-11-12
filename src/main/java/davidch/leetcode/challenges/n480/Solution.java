package davidch.leetcode.challenges.n480;

import java.util.Comparator;
import java.util.TreeSet;

public class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        final var kIsOdd = k % 2 == 1;
        final var result = new double[nums.length - k + 1];

        final Comparator<Integer> compareNums = (idxA, idxB) -> nums[idxA] == nums[idxB] ? idxA - idxB : Integer.compare(nums[idxA], nums[idxB]);
        final var lesserHalf = new TreeSet<>(compareNums.reversed());
        final var greaterHalf = new TreeSet<>(compareNums);

        for (var i = 0; i < k; i++) lesserHalf.add(i);
        while (lesserHalf.size() - greaterHalf.size() > 1) greaterHalf.add(lesserHalf.pollFirst());

        for (var i = k; i < nums.length; i++) {
            result[i - k] = kIsOdd
                    ? nums[lesserHalf.first()]
                    : nums[lesserHalf.first()] / 2. + nums[greaterHalf.first()] / 2.;

            if (lesserHalf.contains(i - k)) lesserHalf.remove(i - k);
            else greaterHalf.remove(i - k);

            if (lesserHalf.isEmpty() || nums[i] <= nums[lesserHalf.first()]) lesserHalf.add(i);
            else greaterHalf.add(i);

            if (lesserHalf.size() - greaterHalf.size() > 1) greaterHalf.add(lesserHalf.pollFirst());
            else if (greaterHalf.size() - lesserHalf.size() > 0) lesserHalf.add(greaterHalf.pollFirst());
        }

        result[result.length - 1] = kIsOdd
                ? nums[lesserHalf.first()]
                : nums[lesserHalf.first()] / 2. + nums[greaterHalf.first()] / 2.;

        return result;
    }
}

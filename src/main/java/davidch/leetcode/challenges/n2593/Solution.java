package davidch.leetcode.challenges.n2593;

import java.util.Arrays;

public class Solution {
    public long findScore(int[] nums) {
        final var elements = new Element[nums.length];
        for (var i = 0; i < nums.length; i++)
            elements[i] = new Element(i, nums[i]);
        Arrays.sort(elements, (e1, e2) -> e1.value == e2.value ? e1.idx - e2.idx : e1.value - e2.value);

        final var marked = new boolean[nums.length];
        var result = 0L;

        for (var element : elements) {
            if (marked[element.idx]) continue;

            result += element.value;
            marked[element.idx] = true;
            if (element.idx > 0) marked[element.idx - 1] = true;
            if (element.idx < elements.length - 1) marked[element.idx + 1] = true;
        }

        return result;
    }

    private record Element(int idx, int value) {
    }
}

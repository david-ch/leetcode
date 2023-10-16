package davidch.leetcode.challenges.n658;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        var left = 0;
        var right = arr.length - 1;
        while (right - left + 1 > k) {
            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) left++;
            else right--;
        }

        final var result = new ArrayList<Integer>();
        for (var i = left; i <= right; i++) result.add(arr[i]);
        return result;
    }
}

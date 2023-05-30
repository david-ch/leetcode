package davidch.leetcode.challenges.n1208;

public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        var result = 0;
        var left = 0;

        for (var right = 0; right < s.length(); right++) {
            maxCost -= Math.abs(s.charAt(right) - t.charAt(right));
            while(maxCost < 0) {
                maxCost += Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}

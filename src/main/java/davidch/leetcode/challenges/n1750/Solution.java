package davidch.leetcode.challenges.n1750;

public class Solution {
    public int minimumLength(String s) {
        final var chars = s.toCharArray();
        var left = 0;
        var right = chars.length - 1;

        var lastRemoved = 'd';
        while (right >= left) {
            if (chars[left] != lastRemoved && chars[left] == chars[right] && left != right) lastRemoved = chars[left];
            else if (chars[left] == lastRemoved) left++;
            else if (chars[right] == lastRemoved) right--;
            else break;
        }

        return right - left + 1;
    }
}

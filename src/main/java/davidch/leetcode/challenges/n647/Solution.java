package davidch.leetcode.challenges.n647;

public class Solution {
    public int countSubstrings(String s) {
        final var chars = s.toCharArray();
        var result = 0;
        for (var i = 0; i < chars.length; i++) {
            var size = 0;
            while (i - size >= 0 && i + size < chars.length && chars[i - size] == chars[i + size]) size++;
            result += size;

            size = 0;
            while (i - size - 1 >= 0 && i + size < chars.length && chars[i - size - 1] == chars[i + size]) size++;
            result += size;
        }
        return result;
    }
}

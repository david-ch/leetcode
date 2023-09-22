package davidch.leetcode.challenges.n28;

public class Solution {
    public int strStr(String haystack, String needle) {
        final var haystackChars = haystack.toCharArray();
        final var needleChars = needle.toCharArray();

        final var lookupEnd = haystackChars.length - needleChars.length + 1;
        for (var h = 0; h < lookupEnd; h++) {
             var n = 0;
             while (n < needleChars.length && needleChars[n] == haystackChars[h + n]) n++;
             if (n == needleChars.length) return h;
        }

        return -1;
    }
}

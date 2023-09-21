package davidch.leetcode.challenges.n14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        final var prefix = strs[0].toCharArray();
        var prefixLen = prefix.length;

        for (var i = 1; i < strs.length; i++) {
            final var str = strs[i].toCharArray();

            prefixLen = Math.min(prefixLen, str.length);
            for (var c = 0; c < prefixLen; c++) {
                if (prefix[c] != str[c]) {
                    prefixLen = c;
                    break;
                }
            }

            if (prefixLen == 0) return "";
        }

        return new String(prefix, 0, prefixLen);
    }
}

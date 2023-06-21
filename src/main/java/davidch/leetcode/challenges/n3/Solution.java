package davidch.leetcode.challenges.n3;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        final var charsInWindowIndexes = new HashMap<Character, Integer>();
        final var len = s.length();

        var result = 0;
        var substringStart = 0;
        for (var i = 0; i < len; i++) {
            final var ch = s.charAt(i);
            final var previousIndex = charsInWindowIndexes.put(ch, i);

            if (previousIndex != null && previousIndex >= substringStart) {
                result = Math.max(result, i - substringStart);
                substringStart = previousIndex + 1;
            }
        }
        result = Math.max(result, len - substringStart);

        return result;
    }
}

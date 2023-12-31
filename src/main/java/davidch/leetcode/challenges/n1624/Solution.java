package davidch.leetcode.challenges.n1624;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        final var lastOccurrence = new Integer['z' - 'a' + 1];
        final var chars = s.toCharArray();
        var result = -1;
        for (var i = 0; i < chars.length; i++) {
            final var chIdx = chars[i] - 'a';
            if (lastOccurrence[chIdx] != null) result = Math.max(result, i - lastOccurrence[chIdx] - 1);
            else lastOccurrence[chIdx] = i;
        }

        return result;
    }
}

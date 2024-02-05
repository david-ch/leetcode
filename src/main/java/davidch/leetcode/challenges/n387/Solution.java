package davidch.leetcode.challenges.n387;

import java.util.Arrays;

public class Solution {
    public int firstUniqChar(String s) {
        final var charsPositions = new int['z' - 'a' + 1];
        Arrays.fill(charsPositions, -1);

        final var chars = s.toCharArray();
        for (var i = 0; i < chars.length; i++)
            charsPositions[chars[i] - 'a'] = charsPositions[chars[i] - 'a'] == -1 ? i : -2;

        var result = -1;
        for (var chPos: charsPositions)
            if (chPos >= 0) result = result == -1 ? chPos : Math.min(result, chPos);

        return result;
    }
}

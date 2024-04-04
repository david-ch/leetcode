package davidch.leetcode.challenges.n1614;

public class Solution {
    public int maxDepth(String s) {
        final var chars = s.toCharArray();
        var level = 0;
        var maxLevel = 0;
        for (var ch : chars) {
            if (ch == '(') {
                level++;
                maxLevel = Math.max(maxLevel, level);
            }
            else if (ch == ')') level--;
        }
        return maxLevel;
    }
}

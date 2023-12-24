package davidch.leetcode.challenges.n1758;

public class Solution {
    public int minOperations(String s) {
        return Math.min(minOps(s, '0'), minOps(s, '1'));
    }

    private int minOps(String s, char lastCh) {
        var ops = 0;
        for (var ch : s.toCharArray()) {
            if (ch == lastCh) {
                ops++;
                lastCh = ch == '0' ? '1' : '0';
            }
            else lastCh = ch;
        }
        return ops;
    }
}

package davidch.leetcode.challenges.n455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        var gi = 0;
        var si = 0;
        var result = 0;
        while (gi < g.length && si < s.length) {
            if (s[si] >= g[gi]) {
                gi++;
                result++;
            }
            si++;
        }

        return result;
    }
}

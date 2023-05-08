package davidch.leetcode.challenges.n392;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        var si = 0;

        for (var ti = 0; ti < t.length(); ti++) {
            if (t.charAt(ti) == s.charAt(si)) {
                si++;
                if (si == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}

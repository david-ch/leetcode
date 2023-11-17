package davidch.leetcode.challenges.n2486;

public class Solution {
    public int appendCharacters(String s, String t) {
        var ti = 0;

        final var sLen = s.length();
        for (var si = 0; si < sLen; si++) {
            if (s.charAt(si) == t.charAt(ti)) {
                ti++;
                if (ti == t.length()) return 0;
            }
        }

        return t.length() - ti;
    }
}

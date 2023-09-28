package davidch.leetcode.challenges.n58;

public class Solution {
    public int lengthOfLastWord(String s) {
        var wordEnd = -1;
        for (var i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && wordEnd == -1) wordEnd = i;
            else if (s.charAt(i) == ' ' && wordEnd != -1) return wordEnd - i;
        }
        return wordEnd + 1;
    }
}

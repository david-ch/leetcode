package davidch.leetcode.challenges.n557;

public class Solution {
    public String reverseWords(String s) {
        var result = new char[s.length()];
        var resultIdx = 0;
        var lastSpaceIdx = -1;

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (var j = i - 1; j > lastSpaceIdx; j--) {
                    result[resultIdx] = s.charAt(j);
                    resultIdx++;
                }

                result[resultIdx] = ' ';
                resultIdx++;
                lastSpaceIdx = i;
            }
        }

        for (var j = s.length() - 1; j > lastSpaceIdx; j--) {
            result[resultIdx] = s.charAt(j);
            resultIdx++;
        }

        return new String(result);
    }
}

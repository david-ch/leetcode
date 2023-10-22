package davidch.leetcode.challenges.n2182;

public class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        final var charsNums = new int[26];
        for (var c : s.toCharArray()) charsNums[c - 'a']++;

        final var result = new char[s.length()];
        var resultIdx = 0;

        for (var i = charsNums.length - 1; i >= 0; i--) {
            while (charsNums[i] > 0) {
                for (var repeat = Math.min(charsNums[i], repeatLimit); repeat > 0; repeat--) {
                    result[resultIdx] = (char) (i + 'a');
                    resultIdx++;
                    charsNums[i]--;
                }

                if (charsNums[i] > 0) {
                    var added = false;
                    for (var j = i - 1; j >= 0; j--) {
                        if (charsNums[j] > 0) {
                            result[resultIdx] = (char) (j + 'a');
                            resultIdx++;
                            charsNums[j]--;
                            added = true;
                            break;
                        }
                    }

                    if (!added) return new String(result, 0, resultIdx);
                }
            }
        }

        return new String(result, 0, resultIdx);
    }
}

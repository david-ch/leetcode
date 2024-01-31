package davidch.leetcode.challenges.n316;

public class Solution {
    public String removeDuplicateLetters(String s) {
        var toAdd = 0;
        var toAddCnt = 26;
        for (var ch: s.toCharArray()) {
            final var chBit = 1 << (ch - 'a');
            if ((toAdd | chBit) != toAdd) {
                toAdd |= chBit;
                toAddCnt--;
                if (toAddCnt == 0) break;
            }
        }

        toAddCnt = 26 - toAddCnt;
        final char[] result = new char[toAddCnt];
        var resultIdx = 0;

        var leftThreshold = 0;
        while (toAddCnt > 0) {
            for (var i = 0; i < 26; i++) {
                if ((toAdd | 1 << i) != toAdd) continue;

                var toSee = toAdd;
                var toSeeCnt = toAddCnt;
                var foundAt = -1;
                for (var j = s.length() - 1; j >= leftThreshold; j--) {
                    final var chIdx = s.charAt(j) - 'a';
                    if ((toSee | 1 << chIdx) == toSee) {
                        toSee ^= 1 << chIdx;
                        toSeeCnt--;
                    }
                    if (chIdx == i && toSeeCnt == 0) {
                        foundAt = j;
                    }
                }

                if (foundAt != -1) {
                    leftThreshold = foundAt;
                    result[resultIdx] = (char) (i + 'a');
                    resultIdx++;

                    toAdd ^= 1 << i;
                    toAddCnt--;
                    break;
                }
            }
        }

        return new String(result);
    }
}

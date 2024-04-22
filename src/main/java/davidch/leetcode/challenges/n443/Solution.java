package davidch.leetcode.challenges.n443;

public class Solution {
    public int compress(char[] chars) {
        var resultLen = 0;
        var currentCh = chars[0];
        var currentGroupSize = 1;

        for (var i = 1; i < chars.length; i++) {
            if (chars[i] == currentCh) currentGroupSize++;
            else {
                chars[resultLen] = currentCh;
                resultLen++;

                if (currentGroupSize > 1) {
                    final var numLen = (int) Math.floor(Math.log10(currentGroupSize));
                    var divisor = (int) Math.pow(10, numLen);
                    while (divisor >= 1) {
                        chars[resultLen] = (char) ('1' + (currentGroupSize / divisor) - 1);
                        resultLen++;
                        currentGroupSize = currentGroupSize % divisor;
                        divisor /= 10;
                    }
                }

                currentCh = chars[i];
                currentGroupSize = 1;
            }
        }

        chars[resultLen] = currentCh;
        resultLen++;

        if (currentGroupSize > 1) {
            final var numLen = (int) Math.floor(Math.log10(currentGroupSize));
            var divisor = (int) Math.pow(10, numLen);
            while (divisor >= 1) {
                chars[resultLen] = (char) ('1' + (currentGroupSize / divisor) - 1);
                resultLen++;
                currentGroupSize = currentGroupSize % divisor;
                divisor /= 10;
            }
        }

        return resultLen;
    }
}

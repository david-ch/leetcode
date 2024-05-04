package davidch.leetcode.challenges.n1071;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        final var chars1 = str1.toCharArray();
        final var chars2 = str2.toCharArray();

        var divisorLen = chars1.length;
        while (divisorLen > 0) {
            if (divides(chars2, chars1, divisorLen)) return new String(chars1, 0, divisorLen);

            do divisorLen--;
            while (divisorLen > 0 && !divides(chars1, chars1, divisorLen));
        }

        return "";
    }

    private boolean divides(char[] str, char[] divisor, int divisorLen) {
        var divisorI = 0;
        for (var c : str) {
            if (c != divisor[divisorI]) return false;
            divisorI++;
            if (divisorI == divisorLen) divisorI = 0;
        }
        return divisorI == 0;
    }
}

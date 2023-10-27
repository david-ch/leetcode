package davidch.leetcode.challenges.n67;

public class Solution {
    public String addBinary(String a, String b) {
        final var result = new char[Math.max(a.length(), b.length()) + 1];

        var i = result.length - 1;
        var ai = a.length() - 1;
        var bi = b.length() - 1;
        var remainder = false;
        while (ai >= 0 || bi >= 0) {
            var r = 0;
            if (ai >= 0) {
                if (a.charAt(ai) == '1') r++;
                ai--;
            }
            if (bi >= 0) {
                if (b.charAt(bi) == '1') r++;
                bi--;
            }
            if (remainder) r++;

            if (r == 1 || r == 3) result[i] = '1';
            else result[i] = '0';
            i--;

            remainder = r > 1;
        }

        if (remainder) {
            result[0] = '1';
            return new String(result);
        }

        return new String(result, 1, result.length - 1);
    }
}

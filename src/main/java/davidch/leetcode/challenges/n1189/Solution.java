package davidch.leetcode.challenges.n1189;

public class Solution {

    public int maxNumberOfBalloons(String text) {
        var bCount = 0;
        var aCount = 0;
        var lCount = 0;
        var oCount = 0;
        var nCount = 0;

        final var len = text.length();
        for (var i = 0; i < len; i++) {
            switch (text.charAt(i)) {
                case 'b' -> bCount++;
                case 'a' -> aCount++;
                case 'l' -> lCount++;
                case 'o' -> oCount++;
                case 'n' -> nCount++;
            }
        }

        return Math.min(bCount, Math.min(aCount, Math.min(lCount / 2, Math.min(oCount / 2, nCount))));
    }
}

package davidch.leetcode.challenges.n1323;

public class Solution {
    public int maximum69Number(int num) {
        var multiplier = 1;
        var mostSignificant6Multiplier = -1;

        while (multiplier < num) {
            if (num % (multiplier * 10) / multiplier == 6) mostSignificant6Multiplier = multiplier;
            multiplier *= 10;
        }

        if (mostSignificant6Multiplier != -1) num += mostSignificant6Multiplier * 3;

        return num;
    }
}

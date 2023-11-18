package davidch.leetcode.challenges.n2405;

public class Solution {
    public int partitionString(String s) {
        var charMet = 0;
        var partitionsNumber = 1;
        for (var c : s.toCharArray()) {
            final var charBit = 1 << ('z' - c);
            if ((charMet | charBit) == charMet) {
                partitionsNumber++;
                charMet = 0;
            }
            charMet |= charBit;
        }
        return partitionsNumber;
    }
}

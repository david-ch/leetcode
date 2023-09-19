package davidch.leetcode.challenges.n13;

public class Solution {

    public int romanToInt(String s) {
        var result = 0;

        final var chars = s.toCharArray();
        for (var i = 0; i < chars.length; i++) {
            final var value = value(chars[i]);
            if (i < chars.length - 1 && value < value(chars[i + 1])) result -= value;
            else result += value;
        }

        return result;
    }

    private int value(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException();
        };
    }
}

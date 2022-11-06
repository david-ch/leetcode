package davidch.leetcode.challenges.n1734;

public class Solution {

    public int[] decode(int[] encoded) {
        var total = 0;
        for (int i = 1; i <= encoded.length + 1; i++) {
            total ^= i;
        }

        var totalWithout1stElem = 0;
        for (int i = 1; i < encoded.length; i+=2) {
            totalWithout1stElem ^= encoded[i];
        }

        final var result = new int[encoded.length + 1];
        result[0] = totalWithout1stElem ^ total;

        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }

        return result;
    }
}

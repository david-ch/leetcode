package davidch.leetcode.challenges.n1346;

import java.util.HashSet;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        final var seen = new HashSet<Integer>();

        for (var n : arr) {
            if (n % 2 == 0 && seen.contains(n / 2) || seen.contains(n * 2)) return true;
            seen.add(n);
        }

        return false;
    }
}

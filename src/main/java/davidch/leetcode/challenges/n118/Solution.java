package davidch.leetcode.challenges.n118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        final var result = new ArrayList<List<Integer>>();

        var previous = List.of(1);
        result.add(previous);

        for (var row = 2; row <= numRows; row++) {
            final var current = new ArrayList<Integer>();
            for (var i = 0; i < row; i++) {
                if (i == 0 || i == row - 1) current.add(1);
                else current.add(previous.get(i - 1) + previous.get(i));
            }

            result.add(current);
            previous = current;
        }

        return result;
    }
}

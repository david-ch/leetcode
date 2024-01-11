package davidch.leetcode.challenges.n119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        final var triangle = new ArrayList<List<Integer>>();
        for (var r = 0; r <= rowIndex; r++) {
            final var row = new ArrayList<Integer>();
            for (var i = 0; i <= r; i++) {
                if (i == 0 || i == r) row.add(1);
                else row.add(triangle.get(r - 1).get(i) + triangle.get(r - 1).get(i - 1));
            }
            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}

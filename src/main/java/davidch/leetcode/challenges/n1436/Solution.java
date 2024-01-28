package davidch.leetcode.challenges.n1436;

import java.util.HashMap;
import java.util.List;

public class Solution {
    public String destCity(List<List<String>> paths) {
        final var citiesOutgoingPathsNumbers = new HashMap<String, Integer>();

        for (var path : paths) {
            citiesOutgoingPathsNumbers.put(path.get(0), citiesOutgoingPathsNumbers.getOrDefault(path.get(0), 0) + 1);
            citiesOutgoingPathsNumbers.put(path.get(1), citiesOutgoingPathsNumbers.getOrDefault(path.get(1), 0));
        }

        for (var cityOutgoingPathsNum : citiesOutgoingPathsNumbers.entrySet()) {
            if (cityOutgoingPathsNum.getValue() == 0) return cityOutgoingPathsNum.getKey();
        }

        throw new IllegalArgumentException("Solution wasn't found");
    }
}

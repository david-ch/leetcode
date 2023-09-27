package davidch.leetcode.challenges.n1615;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        final var degree = new int[n];
        final var connected = new HashMap<Integer, Set<Integer>>();
        for (var road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;

            final var city0Connections = connected.getOrDefault(road[0], new HashSet<>());
            city0Connections.add(road[1]);
            connected.put(road[0], city0Connections);

            final var city1Connections = connected.getOrDefault(road[1], new HashSet<>());
            city1Connections.add(road[0]);
            connected.put(road[1], city1Connections);
        }

        var maxDegreeCities = new HashSet<Integer>();
        var maxDegree = 0;
        var secondMaxDegreeCities = new HashSet<Integer>();
        var secondMaxDegree = 0;

        for (var city = 0; city < n; city++) {
            if (degree[city] > maxDegree) {
                var buf = secondMaxDegreeCities;
                secondMaxDegreeCities = maxDegreeCities;
                secondMaxDegree = maxDegree;

                maxDegreeCities = buf;
                maxDegreeCities.clear();
                maxDegree = degree[city];
            }
            else if (degree[city] > secondMaxDegree) {
                secondMaxDegreeCities.clear();
                secondMaxDegree = degree[city];
            }

            if (degree[city] == maxDegree) maxDegreeCities.add(city);
            else if (degree[city] == secondMaxDegree) secondMaxDegreeCities.add(city);
        }

        if (maxDegree == 0) return 0;

        if (maxDegreeCities.size() > 1) {
            for (var city : maxDegreeCities) {
                for (var anotherCity : maxDegreeCities) {
                    if (!city.equals(anotherCity)
                            && connected.containsKey(city)
                            && !connected.get(city).contains(anotherCity))
                        return maxDegree * 2;
                }
            }

            return maxDegree * 2 - 1;
        }

        for (var city : maxDegreeCities) {
            for (var anotherCity : secondMaxDegreeCities) {
                if (!city.equals(anotherCity)
                        && connected.containsKey(city)
                        && !connected.get(city).contains(anotherCity))
                    return maxDegree + secondMaxDegree;
            }
        }

        return maxDegree + secondMaxDegree - 1;
    }
}

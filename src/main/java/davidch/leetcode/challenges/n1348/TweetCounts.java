package davidch.leetcode.challenges.n1348;

import java.util.*;

public class TweetCounts {

    final Map<String, TreeMap<Integer, Integer>> store = new HashMap<>();

    public void recordTweet(String tweetName, int time) {
        final var tweetStore = store.computeIfAbsent(tweetName, k -> new TreeMap<>());
        tweetStore.put(time, tweetStore.getOrDefault(time, 0) + 1);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        final var tweetStore = store.get(tweetName);
        if (tweetStore == null) return List.of();

        final var periodSize = switch (freq) {
            case "minute" -> 59;
            case "hour" -> 3599;
            case "day" -> 86399;
            default -> throw new IllegalStateException("Unexpected value: " + freq);
        };

        final var result = new ArrayList<Integer>();
        var periodStart = startTime;
        var periodEnd = Math.min(periodStart + periodSize, endTime);

        while (periodStart <= endTime) {
            var rangeResult = 0;
            final var range = tweetStore.subMap(periodStart, true, periodEnd, true);
            for (var count : range.values()) rangeResult += count;
            result.add(rangeResult);

            periodStart = periodEnd + 1;
            periodEnd = Math.min(periodStart + periodSize, endTime);
        }

        return result;
    }
}

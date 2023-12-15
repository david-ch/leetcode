package davidch.leetcode.challenges.n983;

public class Solution {

    private static final int[] TICKET_COVERAGE = {1, 7, 30};
    private int[] memo;

    public int mincostTickets(int[] days, int[] costs) {
        memo = new int[days.length];
        return mincostTickets(days, costs, 0);
    }

    public int mincostTickets(int[] days, int[] costs, int dayIdx) {
        if (dayIdx >= days.length) return 0;
        if (memo[dayIdx] != 0) return memo[dayIdx];

        var result = Integer.MAX_VALUE;
        for (var ticket = 0; ticket < TICKET_COVERAGE.length; ticket++) {
            var newDayIdx = dayIdx;
            while (newDayIdx < days.length && days[newDayIdx] < days[dayIdx] + TICKET_COVERAGE[ticket]) newDayIdx++;
            result = Math.min(result, costs[ticket] + mincostTickets(days, costs, newDayIdx));
        }

        memo[dayIdx] = result;
        return result;
    }
}

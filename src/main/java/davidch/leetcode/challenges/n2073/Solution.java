package davidch.leetcode.challenges.n2073;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        final var targetTickets = tickets[k];
        var time = 0;

        for (var i = 0; i < tickets.length; i++) {
            final var t = Math.min(tickets[i], targetTickets - (i > k ? 1 : 0));
            time += t;
            tickets[i] -= t;
        }

        return time;
    }
}

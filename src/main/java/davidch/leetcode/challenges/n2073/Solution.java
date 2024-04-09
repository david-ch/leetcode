package davidch.leetcode.challenges.n2073;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        var time = 0;
        var i = 0;
        while (tickets[k] != 0) {
            if (tickets[i] > 0) {
                tickets[i]--;
                time++;
            }
            i++;
            if (i == tickets.length) i = 0;
        }
        return time;
    }
}

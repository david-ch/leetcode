package davidch.leetcode.challenges.n1672;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        var highestWealth = 0;

        for (int[] account : accounts) {
            var customerWealth = account[0];

            for (byte j = 1; j < account.length; j++) {
                customerWealth += account[j];
            }

            if (customerWealth > highestWealth) {
                highestWealth = customerWealth;
            }
        }

        return highestWealth;
    }
}

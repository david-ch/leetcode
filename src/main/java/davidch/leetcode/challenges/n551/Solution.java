package davidch.leetcode.challenges.n551;

public class Solution {
    public boolean checkRecord(String s) {
        var absenseDays = 0;
        var lateDays = 0;
        for (var day: s.toCharArray()) {
            if (day == 'L') {
                lateDays++;
                if (lateDays == 3) return false;
                continue;
            }

            if (day == 'A') {
                absenseDays++;
                if (absenseDays == 2) return false;
            }

            lateDays = 0;
        }

        return true;
    }
}

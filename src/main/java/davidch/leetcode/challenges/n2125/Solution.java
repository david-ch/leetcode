package davidch.leetcode.challenges.n2125;

public class Solution {
    public int numberOfBeams(String[] bank) {
        var result = 0;

        var previousRowDevices = 0;
        for (var row: bank) {
            var devices = 0;
            for (var ch: row.toCharArray())
                if (ch == '1') devices++;

            if (devices != 0) {
                result += devices * previousRowDevices;
                previousRowDevices = devices;
            }
        }

        return result;
    }
}

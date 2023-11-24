package davidch.leetcode.challenges.n1024;

import java.util.Arrays;

public class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips, (a, b) ->  a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        var lastTime = 0;
        var nextLastTime = 0;

        var i = 0;
        var clipsNum = 0;

        while (lastTime < time) {
            while (i < clips.length && clips[i][0] <= lastTime) {
                nextLastTime = Math.max(nextLastTime, clips[i][1]);
                i++;
            }

            if (nextLastTime == lastTime) return -1;

            lastTime = nextLastTime;
            clipsNum++;
        }

        return clipsNum;
    }
}

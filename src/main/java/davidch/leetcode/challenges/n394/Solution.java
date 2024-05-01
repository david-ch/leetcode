package davidch.leetcode.challenges.n394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        final var chars = s.toCharArray();

        final var tasks = new Stack<RepeatTask>();
        tasks.push(new RepeatTask());

        for (var i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') tasks.peek().str.append(chars[i]);
            else if (chars[i] >= '1' && chars[i] <= '9') {
                var repeatTimes = 0;
                while (chars[i] != '[') {
                    repeatTimes = repeatTimes * 10 + chars[i] - '0';
                    i++;
                }
                var repeatTask = new RepeatTask();
                repeatTask.repeatTimes = repeatTimes;
                tasks.push(repeatTask);
            }
            else if (chars[i] == ']') {
                final var finishedTask = tasks.pop();
                for (var r = 0; r < finishedTask.repeatTimes; r++) tasks.peek().str.append(finishedTask.str);
            }
        }

        return tasks.peek().str.toString();
    }

    private static class RepeatTask {
        int repeatTimes = 1;
        StringBuilder str = new StringBuilder();
    }
}

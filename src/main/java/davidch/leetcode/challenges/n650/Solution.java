package davidch.leetcode.challenges.n650;

public class Solution {
    public int minSteps(int n) {
        return minSteps(n, 1, 0);
    }

    public int minSteps(int n, int screen, int buffer) {
        if (screen == n) return 0;
        if (screen + buffer > n) return -1;

        var copy = screen == buffer ? -1 : minSteps(n, screen, screen);
        var paste = buffer == 0 ? -1 : minSteps(n, screen + buffer, buffer);
        if (copy == -1 && paste == -1) return -1;
        if (copy == -1) return 1 + paste;
        if (paste == -1) return 1 + copy;
        return 1 + Math.min(copy, paste);
    }
}

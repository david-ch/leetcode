package davidch.leetcode.challenges.n71;

import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        final var stack = new Stack<String>();
        final var pathChars = path.toCharArray();

        var currentFilenameStartIdx = 1;
        for (var i = 1; i <= pathChars.length; i++) {
            if (i != pathChars.length && pathChars[i] != '/') continue;

            final var currentFilename = new String(pathChars, currentFilenameStartIdx, i - currentFilenameStartIdx);

            if (currentFilename.equals("..")) {
                if (!stack.empty()) stack.pop();
            } else if (!currentFilename.equals(".") && !currentFilename.isEmpty()) {
                stack.push(currentFilename);
            }

            currentFilenameStartIdx = i + 1;
        }

        return "/" + String.join("/", stack);
    }
}

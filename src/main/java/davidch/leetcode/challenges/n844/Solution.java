package davidch.leetcode.challenges.n844;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        final var sEditor = typeInEditor(s.toCharArray());
        final var tEditor = typeInEditor(t.toCharArray());
        return sEditor.equals(tEditor);
    }

    private Stack<Character> typeInEditor(char[] str) {
        final var editor = new Stack<Character>();
        for (var i = 0; i < str.length; i++) {
            if (str[i] == '#') {
                if (!editor.empty()) editor.pop();
            }
            else {
                editor.push(str[i]);
            }
        }

        return editor;
    }
}

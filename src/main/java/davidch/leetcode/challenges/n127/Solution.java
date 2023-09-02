package davidch.leetcode.challenges.n127;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        final var visited = new HashSet<String>();
        final Queue<String> q = new LinkedList<>();

        q.offer(beginWord);
        visited.add(beginWord);

        var level = 1;
        while (!q.isEmpty()) {
            for (var i = q.size(); i > 0; i--) {
                final var word = q.poll();
                if (word.equals(endWord)) return level;

                for (var neighbourCandidateIdx = 0; neighbourCandidateIdx < wordList.size(); neighbourCandidateIdx++) {
                    final var neighbourCandidate = wordList.get(neighbourCandidateIdx);
                    if (visited.contains(neighbourCandidate)) continue;
                    if (!isDistanceOne(word, neighbourCandidate)) continue;

                    q.offer(neighbourCandidate);
                    visited.add(neighbourCandidate);
                }
            }

            level++;
        }

        return 0;
    }

    private boolean isDistanceOne(String a, String b) {
        boolean foundOneMismatch = false;
        for (var i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) continue;
            if (foundOneMismatch) return false;
            foundOneMismatch = true;
        }

        return true;
    }
}

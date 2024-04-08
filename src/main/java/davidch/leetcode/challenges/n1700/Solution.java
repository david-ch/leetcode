package davidch.leetcode.challenges.n1700;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        var studentsLeft = students.length;
        var nextSandwichIdx = 0;

        while (studentsLeft > 0) {
            var ateThisRound = 0;

            for (var i = 0; i < students.length; i++) {
                if (students[i] == sandwiches[nextSandwichIdx]) {
                    students[i] = -1;
                    nextSandwichIdx++;
                    studentsLeft--;
                    ateThisRound++;
                    if (studentsLeft == 0) return 0;
                }
            }

            if (ateThisRound == 0) break;
        }

        return studentsLeft;
    }
}

package davidch.leetcode.challenges.n326;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {;
        assertTrue(solution.isPowerOfThree(27));
    }

    @Test
    void example_2() {
        assertFalse(solution.isPowerOfThree(0));
    }

    @Test
    void example_3() {
        assertFalse(solution.isPowerOfThree(-1));
    }

    @Test
    void example_4() {
        assertTrue(solution.isPowerOfThree(1));
    }
}
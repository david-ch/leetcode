package davidch.leetcode.challenges.n383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.canConstruct("a", "b");

        assertFalse(result);
    }

    @Test
    void example_2() {
        final var result = solution.canConstruct("aa", "ab");

        assertFalse(result);
    }


    @Test
    void example_3() {
        final var result = solution.canConstruct("aa", "aab");

        assertTrue(result);
    }
}
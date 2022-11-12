package davidch.leetcode.challenges.n219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        int[] nums = {1, 2, 3, 1};

        final var result = solution.containsNearbyDuplicate(nums, 3);

        assertTrue(result);
    }

    @Test
    void example_2() {
        int[] nums = {1, 0, 1, 1};

        final var result = solution.containsNearbyDuplicate(nums, 1);

        assertTrue(result);
    }

    @Test
    void example_3() {
        int[] nums = {1, 2, 3, 1, 2, 3};

        final var result = solution.containsNearbyDuplicate(nums, 2);

        assertFalse(result);
    }
}
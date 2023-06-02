package davidch.leetcode.challenges.n303;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumArrayTest {

    @Test
    void example_1() {
        final int[] nums = {-2, 0, 3, -5, 2, -1};

        final var arr = new NumArray(nums);

        assertThat(arr.sumRange(0, 2)).isEqualTo(1);
        assertThat(arr.sumRange(2, 5)).isEqualTo(-1);
        assertThat(arr.sumRange(0, 5)).isEqualTo(-3);
    }
}
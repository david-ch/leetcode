package davidch.leetcode.challenges.n433;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var startGene = "AACCGGTT";
        final var endGene = "AACCGGTA";
        final String[] bank = {"AACCGGTA"};
        final var result = solution.minMutation(startGene, endGene, bank);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final var startGene = "AACCGGTT";
        final var endGene = "AAACGGTA";
        final String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        final var result = solution.minMutation(startGene, endGene, bank);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void end_gene_is_not_in_bank() {
        final var startGene = "AACCGGTT";
        final var endGene = "AACCGGTA";
        final String[] bank = {};
        final var result = solution.minMutation(startGene, endGene, bank);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void bank_contains_duplicates() {
        final var startGene = "AAAACCCC";
        final var endGene = "CCCCCCCC";
        final String[] bank = {"AAAACCCA", "AAACCCCA", "AACCCCCA", "AACCCCCC", "ACCCCCCC", "CCCCCCCC", "AAACCCCC", "AACCCCCC"};
        final var result = solution.minMutation(startGene, endGene, bank);
        assertThat(result).isEqualTo(4);
    }
}
package euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EulerTests {

    @Test
    fun task1_multiples_of_3_or_5() {
        val expected = 233168
        val actual = Task01MultiplesOf3Or5.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task2_even_fibonacci_numbers() {
        val expected = 4613732
        val actual = Task02EvenFibonacciNumbers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task3_largest_prime_factor() {
        val expected = 6857L
        val actual = Task03LargestPrimeFactor.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task4_largest_palindrome_product() {
        val expected = 906609
        val actual = Task04LargestPalindromeProduct.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task5_smallest_multiple() {
        val expected = 232792560
        val actual = Task05SmallestMultiple.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task6_sum_square_difference() {
        val expected = 25164150
        val actual = Task06SumSquareDifference.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task7_10001st_prime() {
        val expected = 104743L
        val actual = Task07_10001stPrime.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task8_largest_product_in_a_series() {
        val expected = 23514624000
        val actual = Task08LargestProductInASeries.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task9_largest_product_in_a_series() {
        val expected = 31875000
        val actual = Task09SpecialPythagoreanTriplet.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task10_summation_of_primes() {
        val expected = 142913828922
        val actual = Task10SummationOfPrimes.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task11_largest_product_in_a_grid() {
        val expected = 70600674L
        val actual = Task11LargestProductInAGrid.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task12_highly_divisible_triangular_number() {
        val expected = 76576500L
        val actual = Task12HighlyDivisibleTriangularNumber.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task13_large_sum() {
        val expected = 5537376230L
        val actual = Task13LargeSum.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task14_longest_collatz_sequence() {
        val expected = 837799L
        val actual = Task14LongestCollatzSequence.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task15_lattice_paths() {
        val expected = 137846528820
        val actual = Task15LatticePaths.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task16_power_of_digit_sum() {
        val expected = 1366
        val actual = Task16PowerDigitSum.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task17_number_letter_counts() {
        val expected = 21124
        val actual = Task17NumberLetterCounts.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task18_maximum_path_sum_I() {
        val expected = 1074L
        val actual = Task18MaximumPathSumI.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task19_counting_sundays() {
        val expected = 171
        val actual = Task19CountingSundays.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task20_factorial_digit_sum() {
        val expected = 648
        val actual = Task20FactorialDigitSum.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task21_amicable_numbers() {
        val expected = 31626
        val actual = Task21AmicableNumbers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task22_names_scores() {
        val expected = 871198282
        val actual = Task22NamesScores.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task23_non_abundant_sums() {
        val expected = 4179871
        val actual = Task23NonAbundantSums.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task24_lexicographic_permutations() {
        val expected = "2783915460"
        val actual = Task24LexicographicPermutations.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task25_1000_digit_fibonacci_number() {
        val expected = 4782
        val actual = Task25_1000DigitFibonacciNumber.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task26_reciprocal_cycles() {
        val expected = 983
        val actual = Task26ReciprocalCycles.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task27_quadratic_primes() {
        val expected = -59231
        val actual = Task27QuadraticPrimes.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task28_number_spiral_diagonals() {
        val expected = 669171001
        val actual = Task28NumberSpiralDiagonals.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task29_distinct_powers() {
        val expected = 9183
        val actual = Task29DistinctPowers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task30_digit_fifth_powers() {
        val expected = 443839
        val actual = Task30DigitFifthPowers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task31_coin_sums() {
        val expected = 73682
        val actual = Task31CoinSums.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task32_pandigital_products() {
        val expected = 45228L
        val actual = Task32PandigitalProducts.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task33_digit_cancelling_fractions() {
        val expected = 100L
        val actual = Task33DigitCancellingFractions.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task34_digit_factorials() {
        val expected = 40730
        val actual = Task34DigitFactorials.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task35_circular_primes() {
        val expected = 55
        val actual = Task35CircularPrimes.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task36_double_base_palindromes() {
        val expected = 872187
        val actual = Task36DoubleBasePalindromes.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task37_truncatable_primes() {
        val expected = 748317L
        val actual = Task37TruncatablePrimes.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task38_pandigital_multiples() {
        val expected = 932718654L
        val actual = Task38PandigitalMultiples.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task39_integer_right_triangles() {
        val expected = 840
        val actual = Task39IntegerRightTriangles.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task40_champernownes_constant() {
        val expected = 210
        val actual = Task40ChampernownesConstant.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task41_pandigital_prime() {
        val expected = 7652413L
        val actual = Task41PandigitalPrime.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task42_coded_triangle_numbers() {
        val expected = 162
        val actual = Task42CodedTriangleNumbers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task43_sub_string_divisibility() {
        val expected = 16695334890L
        val actual = Task43SubStringDivisibility.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task44_pentagon_numbers() {
        val expected = 5482660L
        val actual = Task44PentagonNumbers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task45_triangular_pentagonal_and_hexagonal() {
        val expected = 1533776805L
        val actual = Task45TriangularPentagonalAndHexagonal.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task46_goldbachs_other_conjecture() {
        val expected = 5777L
        val actual = Task46GoldbachsOtherConjecture.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task47_distinct_primes_factors() {
        val expected = 134043L
        val actual = Task47DistinctPrimesFactors.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task48_self_powers() {
        val expected = 9110846700L
        val actual = Task48SelfPowers.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task49_prime_permutations() {
        val expected = 296962999629L
        val actual = Task49PrimePermutations.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task50_consecutive_prime_sum() {
        val expected = 997651L
        val actual = Task50ConsecutivePrimeSum.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task51_prime_digit_replacements() {
        val expected = 121313L
        val actual = Task51PrimeDigitReplacements.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task52_permuted_multiples() {
        val expected = 142857L
        val actual = Task52PermutedMultiples.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task53_combinatoric_selections() {
        val expected = 4075
        val actual = Task53CombinatoricSelections.solution()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun task67_maximum_path_sum_II() {
        val expected = 7273L
        val actual = Task67MaximumPathSumII.solution()
        Assertions.assertEquals(expected, actual)
    }
}
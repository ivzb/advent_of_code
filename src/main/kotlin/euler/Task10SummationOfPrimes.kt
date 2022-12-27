package euler

import EulerTask
import utils.Math.findPrimesUntil

object Task10SummationOfPrimes : EulerTask {

    override val name: String = "Summation of primes"

    override fun solution(): Long {
        return findPrimesUntil(2_000_000).sumOf { it.toLong() }
    }
}
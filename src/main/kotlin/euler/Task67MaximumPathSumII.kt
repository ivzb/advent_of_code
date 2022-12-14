package euler

import EulerTask
import readInput
import utils.Point
import java.lang.Math.max

object Task67MaximumPathSumII : EulerTask("Maximum path sum II") {

    override fun solution() = solution_bottom_up()

    fun solution_bottom_up(): Long {
        val input = parseInput()

        for (i in input.size - 2 downTo 0) {
            for (j in 0 until input[i].size) {
                val left = input[i + 1][j]
                val right = input[i + 1][j + 1]
                input[i][j] += max(left, right)
            }
        }

        return input[0][0]
    }

    fun solution_greedy(): Long {
        val input = parseInput()
        val graph = HashMap<Point, List<Point>>()

        for (y in 0 until input.size - 1) {
            for (x in 0 until input[y].size) {
                graph[Point(x, y)] = listOf(
                    Point(x, y + 1),
                    Point(x + 1, y + 1)
                )
            }
        }

        val startPosition = Point(0, 0)
        val startSum = input[startPosition.y][startPosition.x]
        val q = ArrayDeque<Pair<Point, Long>>()
        q.add(startPosition to startSum)

        var bestSum = 0L

        while (true) {
            val possible = HashSet<Pair<Point, Long>>()

            while (q.isNotEmpty()) {
                val (lastPosition, sum) = q.removeLast()

                graph[lastPosition]?.forEach { nextPosition ->
                    val amount = input[nextPosition.y][nextPosition.x]
                    val nextSum = sum + amount

                    possible.add(nextPosition to nextSum)
                    bestSum = max(bestSum, nextSum)
                }
            }

            if (possible.isEmpty()) {
                return bestSum
            }

            val best = possible.sortedByDescending { (_, sum) -> sum }.take(100)

            q.addAll(best)
        }
    }

    private fun parseInput(): List<LongArray> =
        readInput("euler/67").split('\n').map { it.split(' ').map { it.toLong() }.toLongArray() }

}

package utils

enum class Direction(val delta: Point) {

    NORTH(Point(0, -1)),
    NORTH_EAST(Point(1, -1)),
    EAST(Point(1, 0)),
    SOUTH(Point(0, 1)),
    SOUTH_EAST(Point(1, 1)),
    SOUTH_WEST(Point(-1, 1)),
    WEST(Point(-1, 0)),
    NORTH_WEST(Point(-1, -1));

    companion object {

        fun from(delta: Point): Direction =
            values().find { it.delta == delta } ?: error("unknown delta $delta")

        fun distance(distance: Int): List<List<Point>> =
            Direction.values().map { direction ->
                (0 until distance).map { i -> direction.delta * i }
            }

        val deltas: List<Point> by lazy {
            Direction.values().map { it.delta }
        }
    }
}
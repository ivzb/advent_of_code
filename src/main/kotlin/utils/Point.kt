package utils

data class Point(val x: Int = 0, val y: Int = 0) {

    operator fun plus(other: Point): Point = Point(this.x + other.x, this.y + other.y)
    operator fun minus(other: Point): Point = Point(this.x - other.x, this.y - other.y)
    operator fun minus(other: Pair<Int, Int>): Point = this - Point(other.first, other.second)
    operator fun times(other: Int): Point = Point(this.x * other, this.y * other)
    operator fun plus(other: Int): Point = Point(this.x + other, this.y + other)

    fun coerceIn(min: Int, max: Int) = Point(x.coerceIn(min, max), y.coerceIn(min, max))

    fun invert(): Point = Point(this.y, this.x)

    fun toDirection(): Direction = Direction.from(this)

    fun isWithin(bounds: Bounds): Boolean =
        isWithinX(bounds) && isWithinY(bounds)

    fun isWithinX(bounds: Bounds): Boolean =
        this.x >= bounds.min.x && this.x <= bounds.max.x

    fun isWithinY(bounds: Bounds): Boolean =
        this.y >= bounds.min.y && this.y <= bounds.max.y

    fun adjacentTo(deltas: Collection<Point>): List<Point> =
        deltas.map { it + this }

    fun adjacent(): List<Point> =
        adjacentTo(Direction.deltas)

    override fun toString(): String = "($x,$y)"

    companion object {

        fun Pair<Int, Int>.toPoint(): Point = Point(first, second)

        fun String.toPoint(): Point = this
            .split(',')
            .map { it.toInt() }
            .let { (x, y) -> Point(x, y) }
    }

}
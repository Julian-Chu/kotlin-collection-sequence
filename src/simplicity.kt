fun main() {
    val sum = listOf(1, 2, 3, 4, 5).filter { x -> x > 2 }.sum()
    val sum2 = listOf(1, 2, 3, 4, 5).sumWithFilter { x -> x > 2 }

    val first1 = listOf(1, 2, 3, 4, 5).filter { x -> x > 2 }.first()
    val first2 = listOf(1, 2, 3, 4, 5).first { x -> x > 2 }

}

public fun List<Int>.sumWithFilter(pred: (Int) -> Boolean): Int {
    return this.filter { x -> pred(x) }.sum()
}


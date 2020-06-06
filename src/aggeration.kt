fun main() {
    val sum = listOf(1, 2, 3, 4, 5).filter { x -> x > 2 }.sum()
    val sum2 = listOf(1,2,3,4,5).sumWithFilter { x->x>2 }

    println(sum)
}

public fun List<Int>.sumWithFilter(pred: (Int)->Boolean):Int{
 return this.filter{x->pred(x)}.sum()
}


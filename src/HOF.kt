fun main() {
//    val add = { a: Int, b: Int -> a + b }
    val add = getAddOperator()
    val subtract = { a: Int, b: Int -> a - b }


    println(executeOperator(2, 1, add))
    println(executeOperator(2, 1, subtract))

    val assign9ToFirstArg = { b: Int, f: (Int, Int) -> Int -> f(9, b) }
    println(assign9ToFirstArg(1, add))
}

fun executeOperator(a: Int, b: Int, operator: (Int, Int) -> Int) = operator(a, b)


fun getAddOperator(): (Int, Int) -> Int {
   return {a:Int, b:Int->a+b}
}


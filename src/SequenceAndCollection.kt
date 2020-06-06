fun main() {

    val list = listOf(1, 2, 3, 4, 5)
        .filter { x -> x > 3 }
        .map { x -> x * 2 }
    println(list)


    val seq = sequenceOf(1, 2, 3, 4, 5)
        .filter { x -> x > 3 }
        .map { x -> x * 2 }
    println(seq)

    println("intermediate: $seq")
    println("terminal: ${seq.toList()}")

}
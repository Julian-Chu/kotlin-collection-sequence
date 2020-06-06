fun <T> Iterable<T>.myRandom(): T = this.shuffled().first()
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")

fun main() {

    val uniquePatrons1: Set<String> = generateSequence {
        val first = patronList.myRandom()
        val last = patronList.myRandom()
        "$first $last"
    }.distinct().take(9).toSet()
    val uniquePatrons: Set<String> = uniquePatrons1

    println(uniquePatrons)
/*---------------------------*/

//    val patronGold = patronGoldV1(uniquePatrons)
    val patronGold = patronGoldV2(uniquePatrons)
    println(patronGold)
}

private fun patronGoldV2(uniquePatrons: Set<String>): Map<String, Double> {
    val patronGold = uniquePatrons.map { p -> p to 6.0 }.toMap()
    return patronGold
}

private fun patronGoldV1(uniquePatrons: Set<String>): MutableMap<String, Double> {
    val patronGold = mutableMapOf<String, Double>()
    uniquePatrons.forEach {
        patronGold[it] = 6.0
    }

    return patronGold
}



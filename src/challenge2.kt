fun <T> Iterable<T>.myRandom(): T = this.shuffled().first()
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")

fun main() {

//    val uniquePatrons = uniquepatronsV1()
//    val uniquePatrons = uniquepatronsV2()
    val uniquePatrons: Set<String> = uniquePatronsV3()

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


private fun uniquepatronsV1(): MutableSet<String> {
    val uniquePatrons = mutableSetOf<String>()

    (0..9).forEach {
        val first = patronList.myRandom()
        val last = lastName.myRandom()
        val name = "$first $last"
        uniquePatrons += name
    }

    return uniquePatrons
}

private fun uniquepatronsV2(): Set<String> {
    val uniquePatrons: Set<String> = generateSequence {
        val first = patronList.myRandom()
        val last = patronList.myRandom()
        "$first $last"
    }.take(10).toSet()

   return uniquePatrons
}

private fun uniquePatronsV3(): Set<String> {
    val uniquePatrons: Set<String> = generateSequence {
        val first = patronList.myRandom()
        val last = patronList.myRandom()
        "$first $last"
    }.distinct().take(9).toSet()
    return uniquePatrons
}

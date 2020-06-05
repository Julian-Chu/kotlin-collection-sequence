fun main() {
    val valuesToAdd = listOf(1,18,73,44,6,1,33,2,22,5,7)

//    val (step1,_) = valuesToAdd.partition { v->v>=5 }
    val step1 = valuesToAdd.filter { v->v>=5 }

//    val step2 = step1.windowed(2, step = 2, partialWindows = false)
    val step2 = step1.chunked(2)

    val step3 = step2.map { list->list.first()*list.last() }
    val step4 = step3.sum()


    println(step4)
}
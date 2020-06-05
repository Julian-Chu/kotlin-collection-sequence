fun main() {
    val valuesToAdd = listOf(1, 18, 73, 44, 6, 1, 33, 2, 22, 5, 7)

//    val (step1,_) = valuesToAdd.partition { v->v>=5 }
    val step1 = valuesToAdd.filter { v -> v >= 5 }

//    val step2 = step1.windowed(2, step = 2, partialWindows = false)
//    val step2 = step1.chunked(2)
//    val step2 = paginate(step1,2)
    val step2 = step1.paginate(2)

    val step3 = step2.map { list -> list.first() * list.last() }
    val step4 = step3.sum()


    println(step4)
}


fun <T> List<T>.paginate(stepsize: Int): Sequence<List<T>> {
    val size = this.size
    val list = this
    return sequence {
        for (i in 0 until size step stepsize) {

            yield(list.drop(i).take(stepsize))
        }
    }
}

//fun<T> paginate(list:List<T>, stepsize:Int): Sequence<List<T>>{
//    val size = list.size
//
//    return sequence {
//        for (i in 0 until size step stepsize){
//             yield(list.drop(i).take(stepsize))
//        }
//    }
//}
import kotlin.system.measureTimeMillis

fun main() {
    val listInMillis = measureTimeMillis {
        val seq1 = listOf(1,2,3,4).filter { x->x>1 }
        val seq2 = seq1.map { x->x*2 }
        val seq3 = seq2.take(2)
    }

    println(listInMillis)

    val seqToListInMillis = measureTimeMillis {
        val seq1 = sequenceOf(1,2,3,4).filter { x->x>1 }.toList()
        val seq2 = seq1.map { x->x*2 }
        val seq3 = seq2.take(2)
    }

    println(seqToListInMillis)
    val seqInMillis = measureTimeMillis {
        val seq1 = sequenceOf(1,2,3,4).filter { x->x>1 }
        val seq2 = seq1.map { x->x*2 }
        val seq3 = seq2.take(2).toList()
    }
    println(seqInMillis)
}



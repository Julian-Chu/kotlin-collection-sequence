import kotlin.system.measureTimeMillis

fun main() {
    val seqInMillis = measureTimeMillis {
        val seq1 = (1..10000000).asSequence().filter { x->x>1 }
        val seq2 = seq1.map { x->x*2 }
        val seq3 = seq2.take(2).toList()
    }
    println("Sequence completed in $seqInMillis")

    val listInMillis = measureTimeMillis {
        val seq1 = (1..10000000).filter { x->x>1 }
        val seq2 = seq1.map { x->x*2 }
        val seq3 = seq2.take(2)
    }

    println("List completed in $listInMillis")

    val seqToListInMillis = measureTimeMillis {
        val seq1 = (1..10000000).asSequence().filter { x->x>1 }.toList()
        val seq2 = seq1.map { x->x*2 }
        val seq3 = seq2.take(2)
    }

    println("Sequence to List completed in $seqToListInMillis")

//    val seqInMillis1 = measureTimeMillis {
//        val seq1 = (1..10000000).asSequence().filter { x->x>1 }
//        val seq2 = seq1.map { x->x*2 }
//        val seq3 = seq2.take(2).toList()
//    }
//    println(seqInMillis1)
}



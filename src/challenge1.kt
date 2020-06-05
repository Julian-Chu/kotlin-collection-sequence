fun main() {

    val gradeByStudent = mapOf("Josh" to 4.0, "Alex" to 2.0, "Jane" to 3.0)
    var version1 = gradeByStudent.entries.associate{ (k,v)->v to k}
    println(version1)

    var version2 = mutableMapOf<Double, String>().also {
        gradeByStudent.forEach{(k,v)-> it.put(v,k)}
    }
    println(version2)

    var keys = gradeByStudent.keys
    var vals = gradeByStudent.values

    var version3 = vals.zip(keys).toMap()
    println(version3)
}
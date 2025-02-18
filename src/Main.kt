fun evaluateScore(score: Double?) {
    val result = if (score != null) {
        if (score >= 50) "Pass" else "Fail"
    } else {
        "No Score Provided"
    }

    println(result)
}

fun main() {
    var age: Int = 25
//    age = null
    println(age)

    var city : String? = "Madrid"
    city = null
    println(city)
    println(city?.length)
    val cityLength = city?.length ?: 0
    println(cityLength)

    evaluateScore(null)

}
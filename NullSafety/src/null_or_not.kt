fun main() {
    var age: Int = 22
    println(age)

    var city: String? = "Kuwait City"
    println("City length: ${city?.length ?: 0}")

    city = null
    println("City length: ${city?.length ?: 0}")

    val score: Double? = 92.0
    printScore(score)

    val nullScore: Double? = null
    printScore(nullScore)
}

fun printScore(score: Double?) {
    val finalScore = score ?: 0
    print(finalScore)
}

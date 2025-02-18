fun main() {
    var age: Int = 28
    // age = null
    var cityName: String? = "New York"
    println("City name length: " + cityName?.length)
    cityName = null
    val nameLength = cityName?.length ?: 0
    println("City name length: " + nameLength)

    checkScore(85.0)
    checkScore(null)
}

fun checkScore(score: Double?) {
    val result = score ?: "Score is null"
    println("Score: $result")
}
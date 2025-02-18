fun nullDouble(score: Double?): Double {
    return score ?: 10.48
}

fun main() {
    var city: String? = "Kuwait City"
    city = null
    println(city?.length ?: 55)
    println(nullDouble(19.999))
}
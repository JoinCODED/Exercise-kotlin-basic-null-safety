fun main() {
    var age: Int = 10
//    age = null

    var city: String? = "Madrid"
    city = null

    println(city?.length)

    val cityLength = city?.length?: 0
    println(cityLength)

    fun Calculate(score: Double?): Double {
        return score ?: 0.0
    }

    println("valid score: ${Calculate(90.0)}")
    println("null score: ${Calculate(null)}")
}
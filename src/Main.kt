fun main() {
    var age: Int
    // age = null
    // Kotlin: Null cannot be a value of a non-null type 'kotlin.Int'.
    var cityName: String?
    cityName = null
    println(cityName?.length)
    var cityNameLength = cityName?.length ?: 0
    println(cityNameLength)
    println(squareScore(2.0))
    println(squareScore(null))
}
fun squareScore(score: Double?): Double{
    return (score ?: 0.0 ) * (score ?: 0.0)
}
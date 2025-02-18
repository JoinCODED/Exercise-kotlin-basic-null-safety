fun main() {
    var age: Int? = null
    var cityName: String? = null
    var cityNameLength: Int = cityName?.length ?: 1

    println(cityName?.length)
    println(cityNameLength)

    println("Some null val as score: ${getScore((null))}")
    println("Some null val as score: ${getScore(2.0)}")

}

fun getScore (score: Double?): Double {
    val homeScore: Double = score ?: 1.00
    return homeScore * 2.0;
}
fun main() {

    var age: Int = 26  //part1

    //part2
    var cityName: String? = " "

    cityName = "Kuwait City"

    println("$cityName")

    cityName = null

    println("$cityName")

    //end of part 2

    //part3
    var cityName2: String? = " "

    cityName2 = "Kuwait City"
    val cityLength = cityName2?.length
    println("City name length: $cityLength")

    cityName2 = null
    val nullCityLength = cityName2?.length
    println("City name length: $nullCityLength")

    //End of part3

    //part4
    var city: String? = null

    val cityLength2 = city?.length ?: 0
    println("\nCity name length: $cityLength2")

    city = "Kuwait City"
    val nonNullCityLength = city?.length ?: 0
    println("City name length: $nonNullCityLength")
    //End of part4

    //part5

    println("\n${nullableScore(5.0)}")
    println("${nullableScore(null)}")



}

fun nullableScore(score: Double?) {
    val finalScore = score?.times(10) ?: 0.0  // If score is null, use 0.0 as the default
    println("Score: $finalScore")
}
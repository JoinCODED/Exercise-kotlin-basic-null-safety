fun evaluateScore(score: Double?):String {
    val finalScore:Double = score ?: 0.0
    return "The evaluated score = $finalScore"
}

fun main() {
    var number1:Int? = 10
     number1 = null

    println(number1)

    var cityName:String? = "Kuwait City"
    cityName = null

    println(cityName)

    var cityLength= cityName?.length
    println(cityLength)

    var cityLengthTest:Int? = cityName?.length ?: 10
    println(cityLengthTest)

    cityLengthTest = cityName?.length ?: 20
    println(cityLengthTest)

    println(evaluateScore(85.5))
    println(evaluateScore(null))

}
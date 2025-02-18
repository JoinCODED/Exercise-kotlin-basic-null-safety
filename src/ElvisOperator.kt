fun main() {
    var cityName: String? = null
    val cityLengthWithDefault = cityName?.length ?: 0
    println("Default city Name Length: $cityLengthWithDefault")
}
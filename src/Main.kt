fun main() {
    var age: Int = 0
    // age = null // Null can not be a value of a non-null type Int

    var cityName : String? = "Kuwait City"
    println(cityName?.length)

    cityName = null

    val cityNameLength = cityName?.length ?: 10
    println(cityNameLength)

    fun score(s: Double?) {
        // Combined safe and elvis in one
        // Used built in methods div for division times for multiplication n
        println("Score: ${s?.div(2) ?: 0.0}")
        println("Score: ${s?.times(2) ?: 0.0}")
    }

    score(70.0)
    score(null)
}
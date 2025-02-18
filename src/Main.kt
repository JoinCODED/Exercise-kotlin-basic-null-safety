// Function with Nullable Parameter

fun nullableScore(score: Double?): Double {

    // using safe calls in that case the minimum value should be 0.0
    // using Elvis it will always return a default value of 0.0 if score is null
    val length: Double = score ?.coerceAtLeast(0.0)?: 0.0
    return length

}

fun main() {

    // 1 Non-Nullable Variable
    var nonNullableAge: Int = 24
    // Null cannot be a value of a non-null type
    // nonNullableAge = null

    // 2 Nullable Variable
    var nullableCity: String? = "Kuwait city"
    nullableCity = null

    // 3 Working with Safe Calls
    var cityLengthSafe: Int? = nullableCity?.length
    println("The length of the name is $cityLengthSafe") // since it was assign null the length will be null

    // 4 Default Values with Elvis Operator
    val cityLengthElvis: Int = nullableCity?.length ?: 4
    println("The length of the name is $cityLengthElvis") // in this case it will default length of 4 if city name is null

    // 5 Function with Nullable Parameter
    val score: Double? = null
    println(nullableScore(score))
    println(nullableScore(4.0))
    println(nullableScore(-3.9))



}
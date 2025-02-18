fun main() {
    var nonNullableAge:Int = 19
//    nonNullableAge = null
    var nullableCityName:String? = "Kuwait City"
    nullableCityName = null


    println(nullableCityName?.length?:0)

    fun nullableParam(score:Double?):Double{
        return score?: 0.0 * 100
    }

    println(nullableParam(200.0))
    println(nullableParam(null))

}
fun main(){

    //1-Non-Nullable Variable
    val age : Int = 23
    //age = null  -----> Error


    //2-Nullable Variable
    var cityName : String ? = "Manchester"
    println(cityName)
    cityName = null
    println(cityName)

   //3-Working with Safe Calls
    println(cityName?.length)


    //4-Default Values with Elvis Operator
    cityName = null
    println(cityName?.length)
    var cityName2: String? = null
    val cityLength = cityName2?.length ?: 0
    println(cityLength)


    //5 Function with Nullable Parameter
    fun Score(score : Double?) {
        val valid = score?.toString() ?: "???"
        println(valid)
    }
    Score(23.2)
    Score(null)




}
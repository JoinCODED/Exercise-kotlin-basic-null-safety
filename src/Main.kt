fun main() {


    var age: Int = 1



   // nonNullVariable = null




    var city:String? ="Kuwait"

    city=null


    println(city?.length)

    val defaultCity = city ?: "Kuwait"

    println(defaultCity)

println( keepScore(null))


}




fun keepScore(score: Double?): Double {
    return score ?: 0.0
}
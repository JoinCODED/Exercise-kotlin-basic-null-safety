import kotlin.math.absoluteValue

fun main() {
    println("Hello World!")
/*
    // 1.
var nonValue: Int = 35
    nonValue = null
    println("The value is ${nonValue}")

   //2.
   var city: String? = null
    //3. //4.
    var lenght = city?.length ?: 0
println("The length is $lenght")
*/
    //5.
    fun scoreValue ( score: Double ): Double {
return score ?: 0.0

    }

    println(" ${scoreValue (90.0)}")

}
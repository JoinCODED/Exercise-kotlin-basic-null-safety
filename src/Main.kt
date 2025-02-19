fun main() {
 //  var age: Int = 27
 //  age = null

   var cityName: String? = "Kuwait City"
   cityName = null
    println(cityName?.length)


    val nameLength = cityName?.length ?: 9
    println(nameLength)

    getScore(null)
    getScore(10.50)
}
fun getScore (score : Double?){

    // Safe call
    println(score)


}
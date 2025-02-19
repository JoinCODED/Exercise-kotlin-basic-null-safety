fun main() {
 //   var age: Int = 27
  //  age = null

    var cityName: String? = "Kuwait City"
    cityName = null
  //  println(cityName?.length)


    val nameLength = cityName?.length ?: 9
// Outputs 0 as employeeName is null
    println(nameLength)

}
fun main (){
    var city: String? = "London"

    println("City Length: ${city?.length}")

    city = null
    println("City Length: ${city?.length}")
}
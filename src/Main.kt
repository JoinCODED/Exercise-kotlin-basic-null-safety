fun main() {
    // part 1
var age:Int = 28
    // age = null : won't work

// part 2
    var city:String? = "Glasgow"
    println(city?.length)
    city = null // works like magic

    // part 3
    println(city?.length)

    // part 4
    var defaultCity = city?:"Kuwait"
    println(defaultCity)

    println(getScore(null))
    println(getScore(30.0))



}


// 5
fun getScore(score: Double?):Double?{
    var result = score?:10.0
    return result
}
fun main() {

    var age:Int? = 90;
    age = null;

    var city:String? = "Kuwait"
    city = null;

    println(city?.length);

    println(city?:"Mushrif")
    randomFunction(null);
    randomFunction(10.0);

}

fun randomFunction(score:Double?){
    val finalScore = (score ?: 0.0) * 10;

    println("Your score is: $finalScore")
}
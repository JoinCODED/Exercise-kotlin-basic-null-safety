fun main(){
    handleScore(99.0)
    handleScore(null)
}
fun handleScore(score: Double?) {
    val finalScore = score?.takeIf { it >= 0 } ?: 0.0
    println("Final Score: $finalScore")
}


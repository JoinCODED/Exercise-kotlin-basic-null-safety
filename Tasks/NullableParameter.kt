fun checkScore (score: Double?) {
    val finalScore = score ?: 0.0
    println("Final Score: $finalScore")
}
fun main () {
    checkScore(83.6)
    checkScore(null)
}
fun evaluateScore(score: Double?): String {
    val finalScore = score ?: 0.0
    return if (finalScore >= 50) "Pass" else "Fail"
}

fun main() {
    println("Score 75.5: ${evaluateScore(75.5)}")
    println("Score null: ${evaluateScore(null)}")
}
fun main() {
    val likes = 71
    val endingOfTheWord = if (likes == 11 || likes % 100 == 11 || likes % 10 != 1) "людям" else "человеку"
    println("Понравилось $likes $endingOfTheWord")
}
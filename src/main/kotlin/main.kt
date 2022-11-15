fun main() {
    val likes = 21
    val total = if ((likes % 10 == 1) && (likes != 11) && (likes % 100 != 11)) "человеку" else "людям"
    println("понравилось $likes $total")

}
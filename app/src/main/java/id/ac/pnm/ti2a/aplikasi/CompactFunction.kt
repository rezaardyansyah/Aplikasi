package id.ac.pnm.ti2a.aplikasi

fun gantiDino (day: String, temperature: Int = 15, dirty: Int = 2): Boolean {
    return when {
        temperature > 10 -> true
        dirty > 10 -> true
        day == "Ahadun" ->  true
        else -> false
    }
}

fun acakDino(): String{
    val dino =  listOf("Isnain", "Salasun", "Rabuun", "Kamisun", "Jumatun", "Sabtuun", "Ahadun")
    return dino.random()
}

fun main(){
    println()
}
package id.ac.pnm.ti2a.aplikasi

fun main(){
    val a = double(x=5)
    val b = double(x=3)

    println("a x b = $a x $b = ${a*b}")

    println("==List Filter==")
    val books = listOf("nature", "biology", "birds", "math")
    println(books.filter { it[1] == 'a' })

    println("==Eager Filter==")
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: $eager")

    println("==Lazy Filter==")
    val filtered = instruments.asSequence().filter { it[0] == 'c'}
    println("filtered: " + filtered)
    println("newlist: " + eager)

    println("==MAP==")
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    println("==Flatten==")
    val list = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(list.flatten())
}

fun double(x: Int):Int = x * 2
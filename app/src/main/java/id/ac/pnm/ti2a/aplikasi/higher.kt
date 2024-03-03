package id.ac.pnm.ti2a.aplikasi

fun main() {
    println("==============================")
    println(updateDirty(100, waterFilter))
    println("==============================")
    println(updateDirty(90, ::increaseDirty))

    println("==============================")
    var dirtyLevel = 20
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23 }
    println(dirtyLevel)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 5 }

fun increaseDirty(start: Int): Int = start + 1
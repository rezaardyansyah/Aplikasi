package id.ac.pnm.ti2a.aplikasi

class profile(
    val name      : String = "Muhammad Hikmal Akbar Reza Ardyansyah",
    val nim       : Int    = 233307021,
    val courses   : String = "Teknologi Informasi",
    val address   : String = "Ds. Jatirejo Kec. Wonoasri Kab. Madiun",
    val hobby     : String = "Rebahan",
    val descHobby : String = "Karena dengan rebahan saya dapat merasakan sensasi yang luar biasa"
) {
    fun tampilanUtama() {
        println("+--------------------------------------------------------------------------------------------+")
        println("|                                     PROFILE STUDENT                                        |")
        println("+--------------------------------------------------------------------------------------------+")
        println("| Name                 : $name                               |")
        println("| NIM                  : $nim                                                           |")
        println("| Courses              : $courses                                                 |")
        println("| Address              : $address                              |")
        println("| Hobby                : $hobby                                                             |")
        println("| Description          : $descHobby  |")
        println("+--------------------------------------------------------------------------------------------+")
    }
}

fun main(){
    val person=profile()
    person.tampilanUtama()
}



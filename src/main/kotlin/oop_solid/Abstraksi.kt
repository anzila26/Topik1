package oop_solid

abstract class Dosen(){
    abstract fun namaDosen()
    fun jumlahMatkulAjar(){
        println("Jumlah matkul yang diajar : 2")

    }

}
class Matkul(): Dosen(){
    override fun namaDosen() {
        println("Nama Dosen : Andika")
    }

}

fun main() {
    val matkul = Matkul()
    matkul.namaDosen()
    matkul.jumlahMatkulAjar()
}
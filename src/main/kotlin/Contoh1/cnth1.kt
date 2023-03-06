package Contoh1

class Bintang1() {
    internal var n: Int = 8
    fun pyramidBintang() {
        for (i in 0 until n) {
            for (j in 0 until n - i) {
                print(" ")
            }
            for (k in 0 until i) {
                print("* ")
            }
            println("")
        }
    }
}

class Bintang2(var n : Int){
    fun pyramidTerbalik() {
        for (i in n downTo  1) {
            for (j in 1 .. n - i) {
                print(" ")
            }
            for (k in 1 .. i) {
                print("* ")
            }
            println("")
        }
    }
}

fun main() {
    val bntg = Bintang1()
    bntg.pyramidBintang()

    val bntg2 = Bintang2(8)
    bntg2.pyramidTerbalik()
}
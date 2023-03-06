package Challenge_1

open class Bintang2(){
    var n: Int = 8
    open fun pyramidTerbalik() {
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

class Pyramid3: Bintang2(){

}

fun main() {
    val bntg2 = Pyramid3()
    bntg2.pyramidTerbalik()
}
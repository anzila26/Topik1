package Challenge_1

open class Bintang1() {
    protected open var n: Int = 9
    open fun pyramidBintang() {
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

class Pyramid : Bintang1(){

}

fun main() {
    val bntg = Pyramid()
    bntg.pyramidBintang()
}

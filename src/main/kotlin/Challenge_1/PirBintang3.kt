package Challenge_1

class Pyramid15 : Bintang1(){
    override var n : Int = 8
    override fun pyramidBintang() {
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

class Pyramid14 : Bintang2(){

}


fun main() {
    val bntg15 = Pyramid15()
    bntg15.pyramidBintang()

    val bntg14 = Pyramid14()
    bntg14.pyramidTerbalik()
}
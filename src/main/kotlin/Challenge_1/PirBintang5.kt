package Challenge_1

class Pyramid17() : Bintang2(){
    override fun pyramidTerbalik() {
        for(i in 1..n)
        {
            for(j in 1..i)
            {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val bntg17 = Pyramid17()
    bntg17.pyramidTerbalik()
}
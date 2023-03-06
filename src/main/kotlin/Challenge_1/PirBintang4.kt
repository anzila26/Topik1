package Challenge_1

class Pyramid16() : Bintang2(){
    override fun pyramidTerbalik() {
        val k = n * 2 - 1
        for(i in 1..k){
            for(j in 1..k){
                if(j==i || (j==k - i + 1))
                {
                    print("*")
                }
                else
                {
                    print(" ")
                }
            }
            println("")
        }
    }
}

fun main() {
    val bntg16 = Pyramid16()
    bntg16.pyramidTerbalik()
}
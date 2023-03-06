package Challenge_1

class Pyramid18() : Bintang2(){
    override fun pyramidTerbalik() {
        val k = n * 2 - 1
        val m = n - 1
        for(i in 1..k){
            if(i == n)
            {
                for (j in 1..k) {
                    print("*")
                }
            }
            else
            {
                for(l in 1..m){
                    print(" ")
                }
                print("*")
            }
            println("")
        }
    }
}

fun main() {
    val bntg18 = Pyramid18()
    bntg18.pyramidTerbalik()
}
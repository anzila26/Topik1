class Manusia {
    var nama : String = "Anzila"
    var kelamin : String = "Perempuan"
    var tinggiBadan : Int = 170
    var beratBadan : Int = 60
    fun eat() = "Butuh Makan"
}


fun main() {
    //manusia dibawah adalah nama object yang dibuat dari class Manusia
    val manusia = Manusia()
    println("Nama : ${manusia.nama}")
    println("Jenis Kelamin : ${manusia.kelamin}")
    println("Tinggi Badan : ${manusia.tinggiBadan}")
    println("Berat Badan : ${manusia.beratBadan}")
    println("Makan : ${manusia.eat()}")
}
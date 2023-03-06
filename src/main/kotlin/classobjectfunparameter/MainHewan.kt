package classobjectfunparameter

fun main() {
    //Hewan Deklarasi Object
    val hewan1 = Hewan()
    println("Jenis Hewan : ${hewan1.jenisHewan}")
    println("Hewan memiliki : ${hewan1.kakiHewan} kaki")
    println("Kemampuan yang dimiliki : ${hewan1.suaraHewan()}")

    val hewan2 = Hewan()
    hewan2.jenisHewan = "Anjing"
    println("Jenis Hewan: ${hewan2.jenisHewan}")

    val hewan3 = Hewan()
    hewan3.jenisHewan = "Gajah"
    println("Jenis Hewan: ${hewan3.jenisHewan}")
}
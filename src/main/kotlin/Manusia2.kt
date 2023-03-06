//contoh membuat constructor

class Manusia2 (
    val nama: String,
    val kelamin: String,
    val tinggiBadan: Int,
    val beratBadan: Int,
){
    //body class
}

fun main() {
    val mahasiswa = Manusia2(
        nama = "Anzila",
        kelamin = "Perempuan",
        tinggiBadan = 153,
        beratBadan = 50
    )

    val mahasiswa2 = Manusia2(
        "Dina", "Perempuan", 160, 48
    )

    println("Nama : ${mahasiswa.nama}")
    println("Kelamin : ${mahasiswa.kelamin}")
    println("tinggiBadan : ${mahasiswa.tinggiBadan}")
    println("beratBadan : ${mahasiswa.beratBadan}")

    println("Nama : ${mahasiswa2.nama}")
    println("Kelamin : ${mahasiswa2.kelamin}")
    println("tinggiBadan : ${mahasiswa2.tinggiBadan}")
    println("beratBadan : ${mahasiswa2.beratBadan}")
}
package classobjectfunparameter

fun main() {
    val Pembeli1 = TokoBuku()
    println("===============================")
    println("STRUK PEMBELIAN BUKU TOKO AND5")
    println("-------------------------------")
    println("Nama Pembeli : ${Pembeli1.NamaPembeli}")
    println("Buku yg dibeli : ${Pembeli1.JudulBuku}")
    println("Jumlah : ${Pembeli1.JumlahBuku}")
    println("Total ${Pembeli1.totalPembelian()}")
    println("Bayar : ${Pembeli1.UangBayar}")
    println("Kembalian ${Pembeli1.kembalianPembelian()}")
    println("=========TERIMAKASIH==========")
    println("TOKO BUKU AND5")
    println("==============================")
}
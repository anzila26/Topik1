package classobjectfunparameter

class TokoBuku (){
    var NamaPembeli : String = readLine()!!.toString()
    var JudulBuku : String = readLine()!!.toString()
    var JumlahBuku : Int = readLine()!!.toInt()
    var Harga : Int = readLine()!!.toInt()
    var UangBayar : Int = readLine()!!.toInt()

    fun totalPembelian(): String{
        val total = "Pembelian : " + JumlahBuku * Harga
        return total
    }

    fun kembalianPembelian(): String{
        val kembali = "Pembeli : " + (UangBayar - (JumlahBuku * Harga))
        return kembali
    }
}
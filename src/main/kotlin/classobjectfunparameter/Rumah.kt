package classobjectfunparameter

class Rumah {
    // atribut - properti
    var panjangRumah: Int = 100
    var lebarRumah: Int = 50
    var luasTanah = 100
    var namaPemilik: String = "Jihan"
    var warnaRumah: String = "Kuning"

    //deklarasi function
    fun hidupkanLampu(): String {
        return "Rumah bisa menghidupkan lampu"
    }

    fun naikTurunLift(): String {
        return "Bisa naik turun menggunkan lift"
    }

    fun tahanPanas(): String {
        return "Rumahnya tahan panas"
    }
}
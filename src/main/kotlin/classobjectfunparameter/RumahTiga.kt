package classobjectfunparameter

class RumahTiga {
    //atribut - properti
    var panjangRumah: Int = 100
    var lebarRumah: Int = 50
    var luasTanah = 100
    var namaPemilik: String = "Jihan"
    var warnaRumah: String = "Kuning"

    constructor(_panjangRumah : Int, _lebarRumah : Int, _namaPemilik : String){
        this.panjangRumah = _panjangRumah
        this.lebarRumah = _lebarRumah
        this.namaPemilik = _namaPemilik
    }

    constructor(_luasTanah : Int, _warnaRumah : String){
        this.luasTanah = _luasTanah
        this.warnaRumah = _warnaRumah
    }

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

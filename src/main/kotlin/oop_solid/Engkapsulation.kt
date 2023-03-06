package oop_solid

class Mahasiswa(){
    var name :String = "Dwiki"
    private var age : Int = 21 //yg bisa akses hanya class yang sama
    open protected var address : String = "Depok" //class dan sub class
    internal var nim : String = "8357265" //class yg sama / 1 project
}

fun main() {
    val mhs = Mahasiswa()
    //kalo mau akses age gabisa soalnya dia private
    println("Nim : ${mhs.nim}")

    val fsw = FswClass()
    fsw.exPublic()
}

class FswClass(){
    fun exPublic(){

    }
    fun exPrivate(){

    }
    fun exProtected(){

    }
}
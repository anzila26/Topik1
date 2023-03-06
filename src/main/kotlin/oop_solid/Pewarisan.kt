package oop_solid

open class Animal (){
    open fun deskripsi(){
        println("deskripsi hewan")
    }
    open fun namaAnimal(nama : String){
        println("nama binatang : $nama ")
    }
}

class Harimau(): Animal(){
    override fun deskripsi() {
        super.deskripsi()
    }
    fun warnaKulit(){
    }
}

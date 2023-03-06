package SOLID

open class Member(){
    open fun memberKosumen(nama : String): String{
        return nama
    }
}

class poinKonsumen : Member(){
    fun getPoin(){
    }
}
package Latihan_OOP

open class Person2{
    open var name : String = "Jeje"
    open var age : Int = 25
}

class Student() : Person2(){
    fun getDetails(){
        var classs : Int = 6
        var score : Double = 80.75
        override var name = "Lolo"
        override var age = "Yoyo"
    }
}

fun main() {
    val details2 = Student()
    details2.getDetails()
    println("nama : $name ")

}
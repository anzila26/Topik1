package oop_solid

class Person(val name: String, val age: Int){
    fun introduce() {
        println("Hi, my name is $name and I am $age years old")
    }
}

fun main() {
    val orang = Person("jesika", 20)
    orang.introduce()
}
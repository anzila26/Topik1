package Latihan_OOP

class Person(val name: String, val age: Int){
    fun introduce() {
        println("Hi, my name is $name and I am $age years old")
    }
}

class Rectangle(val width : Int, val height : Int) {
    val luas = width * height
    fun getArea() {
        println("luas persegi panjang : $luas")
    }
}

class Animal(val name: String, val sound : String) {
    fun makeSound(){
        println("$name says $sound")
    }
}

class Car(val brand: String, val model: String, val year: Int) {
    fun startEngine(){
        println("The $brand $model $year engine has started!")
    }
}

class BankAccount(val balance: String){

    fun deposit(){
        println()
    }

    fun withdraw(){

    }
}

fun main() {
    val orang = Person("Jesika", 20)
    orang.introduce()

    val lpersegi = Rectangle(10, 15)
    lpersegi.getArea()

    val suara = Animal("Dino", "hahaha")
    suara.makeSound()

    val mobil = Car("Wuling", "Air EV", 2022)
    mobil.startEngine()
}
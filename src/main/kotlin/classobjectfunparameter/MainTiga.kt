package classobjectfunparameter

fun main() {

    //Deklarasi Object
    //object 1
    val rumahA = Rumah()
    println("Nama Pemilik Rumah : ${rumahA.namaPemilik}")
    println("Salah satu fungsi rumah A : ${rumahA.tahanPanas()}")
    println("Warna rumah A : ${rumahA.warnaRumah}")

    //object2
    val rumahB = Rumah()
    rumahB.namaPemilik = "Andika"
    println(rumahB.namaPemilik)

    contohPrimaryConst()
    contohSecondConst()
    contohLambFun()
    higherOrderFun()

    val sum = {a : Int, b : Int -> a+b}
    val sub = {a : Int, b : Int -> a-b}

    val hitungSum = calculate(12, 14, sum)
    val hitungSub = calculate(13, 10, sub)
    println("Hasil Penjumlahan : $hitungSum")
    println("Hasil Pengurangan : $hitungSub")
}

fun contohPrimaryConst() {
//primary constructor
    val rumahC = RumahDua(100, 80, 100, "Sekar")
    rumahC.luasTanah = 150
}

fun contohSecondConst() {
//secondary constructor
    val rumahD = RumahTiga(100, 80, "Rogo")
    val rumahE = RumahTiga(150, "Kuning")
}

fun contohLambFun(){
    val ucapanUltah = { name : String -> "Happy Birthday $name"}
    val ucapan1 = ucapanUltah("Anzila")
    println(ucapan1)
}

fun higherOrderFun() {
    //HOF adalah function yang ada didalam parameter function
}

fun calculate (a : Int, b : Int, operation:(Int, Int)->Int): Int{
    return operation(a, b)
}
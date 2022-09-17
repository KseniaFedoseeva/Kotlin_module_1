import java.util.*

fun main(args: Array<String>) {
    // Модуль 1
    // Задание 1
    var a : Any? = null
    a = 10
    val b = a/2.5 // double

    // Задание 2
    val str = "hello"
    val str1 = "aplana"
    println(str +" "+ str1)

    //Задание 3
    var five: Char = '5'
    five.toString()
    five.toString().toInt()
    five.toString().toDouble()
    five.toString().toFloat()
    five.toString().toLong()
    five.toString().toShort()
    five.toString().toByte()

    //Задание 4
    println("Введите имя")
    var userText : String? = readLine()
    var stringText : String = userText.toString()
    println("Привет, $stringText")

    //Задание 5

    for (x in 'z' downTo 'a') {
    println(x)}

    // Задание 6
    val reader = Scanner(System.`in`)
    println("Введите число а")
    val a1 : Int = reader.nextInt()
    println("Введите число b")
    val b1 : Int = reader.nextInt()
    var c = true
    if(a1>b1){
        println(c)
    }
    else {
        c = false
        println(c)
    }

}
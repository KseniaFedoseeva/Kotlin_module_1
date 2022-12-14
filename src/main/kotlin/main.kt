import java.lang.Math.sqrt
import java.util.*
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashMap
import kotlin.test.assertTrue

val reader = Scanner(System.`in`)
val employe = mutableMapOf(457 to "Кротов М.И.")
fun addEmploy(){
    println("Ведите ФИО")
    val fio = readln()
    println("Ведите номер рабочего места")
    val numplace = reader.nextInt()
    employe.put(numplace, fio)
}

fun leapYear (year : Int) {

    if (year % 4 != 0) {
        if (year % 100 == 0) {
            if (year % 400 != 0)
                println("Это обычный год")
            else println("Високосный год")
        } else println("Это обычный год")
    } else println("Високосный год")
}

fun String.getThirdLetter(): Char{
    return this[2]
}

fun <T>Array<T>.changePlace(ind1: Int, ind2: Int) {
    val s1 = this[ind1]
    val s2 = this[ind2]
    this[ind1] = s2
    this[ind2] = s1

}

fun <T>Array<T>.print(){
    for(i in this){
        print(i)
    }
}

    fun main(args: Array<String>) {


        val moneyCase = Case<Long>(100000000)
        println(moneyCase.get())
        moneyCase.add(500)
        println(moneyCase.get())

        val h = "rhue"
        println(h.getThirdLetter())

        val dh = arrayOf("2", "d", "i")
        dh.changePlace(1, 2)
        dh.print()


        val smsServ = SMSService()
                val emailServ = EmailService()
        emailServ.sendMessage("Vasya@", "Petya@", "Message")
        smsServ.sendMessage(23245678912, 15412369854, "hghgj")



        val user1 = User("Gut", "Yun", 8)
        val user2 = User("Gut", "Ykn", 9)
        println(user2 == user1)
        println(user1.hashCode())
        println(user2.hashCode())





        val nh=10
        var count = 0
       for(ig in 1 until nh){
           if(ig%2 != 0){
               count++
           }

       }

        //Итоговое задание

        val cy = Cy34(45,45,45)
        val an =An70(85, 855, 85)
        val boeing = Boeing747(782, 95, 55, 290)
        var setPlans = mutableSetOf(cy, an, boeing)

        println("""Выберите действие:
            | 1. Показать данные по всем самолетам
            | 2. Показать информацию по Су-34
            | 3. Показать информацию по Ан-70
            | 4. Показать информацию по Boeing747
            | 5. Количество самолетов
        """.trimMargin())
        var info: Int = reader.nextInt()

        if (info == 1){
            var intNumber: Int = reader.nextInt()
            setPlans.forEach{println(it.printInfo())}
        }
        else if (info == 2){
          val cy34 = setPlans.filterIsInstance<Cy34>()
          cy34.forEach { println(it.printInfo()) }
        }
        else if (info == 3){
            val an = setPlans.filterIsInstance<An70>()
            an.forEach { println(it.printInfo()) }
        }
        else if (info == 4){
            val bo = setPlans.filterIsInstance<Boeing747>()
            bo.forEach { println(it.printInfo()) }
        }
        else if (info == 5){
            val count = setPlans.count()
            println("Всего $count")
        }

        // Модуль 4
       // Задание 23
        val car = Avto("Kia", "red", "A678OO")
        car.printInfoAvto()


        //Модуль 3
        //Задание 12
        println("Введите год")
        val y = reader.nextInt()
        leapYear(y)

        //Задание 13
        fun countEmploy(vararg names: String): Int {
            var count = 0
            for (n in names)
                count += 1
            println("Количество сотрудников: $count")
            return count
        }

        //Задание 14
        fun info(name: String, position: String) {
            println("$name : $position")
        }

        fun info(name: String, age: Int, position: String) {
            println("$name, $age : $position")
        }

        fun info(name: String, marital_status: String, position: String) {
            println("$name, $marital_status : $position")
        }

        fun info(name: String, age: Int, marital_status: String, position: String) {
            println("$name, $age, $marital_status : $position")
        }

        //Задание 15
        val ar: Array<String> = arrayOf("Англия", "Франция", "Бельгия", "Германия")
        val arrPrint = { arr: Array<String> -> for (a in ar) println(a) }
        arrPrint(ar)

        //Задание 16
        fun Double.root() {
            println(sqrt(this))
        }

        var example: Double = 2.6
        example.root()


        //Модуль 2
        // Задание 7
        println(
            """1. Что есть в Kotlin, но нет в Java?
        |1.Синглтоны.
        |2.Null-безопасность.
        |3.Классы
        |4. 1 и 2
    """.trimMargin()
        )
        var a71: Int = reader.nextInt()
        println(
            """2. Имя переменной должно начинаться:
        |1.С нижнего подчеркивания
        |2.Только с цифры
        |3.Только с буквы
        |4.Либо с буквы, либо с нижнего подчёркивания.
    """.trimMargin()
        )
        a71 += reader.nextInt()
        println(
            """3. Переменная val это:
        |1.константа времени компиляции
        |2.не константа
        |3.изменяемая переменная
        |4.константа времени выполнения
    """.trimMargin()
        )
        a71 += reader.nextInt()
        println(
            """4. Удалите пробелым в строке "Кот сидит на крыше".:
        |1.filter { it.isWhitespace() }
        |2.dropLast(1)
        |3.drop(1)
        |4.filter { !it.isWhitespace() }
    """.trimMargin()
        )
        a71 += reader.nextInt()
        println(
            """5. Лямбда-выражение - это:
        |1.функция, которая может быть вызвана из другого кода с помощью точечной нотации.
        |2.функция, связанная с объектом
        |3.именованный блок кода, вызываемый из других мест в исходном коде
        |4.анонимная функция, которая может кратко представлять функцию с одним параметром
    """.trimMargin()
        )
        a71 += reader.nextInt()
        println(
            when (a71) {
                20 -> "У вас отличные знания Kotlin"
                in 16..19 -> "У вас хорошие знания Kotlin"
                in 12..15 -> "У вас удовлетворительные знания Kotlin"
                in 5..11 -> "Не зачтено"
                else -> "В тесте нужно выбрать вариат ответа от 1 до 4"
            }
        )

        //Задание 8
        println("Введите сумму вклада в тыс. руб.")
        val sum = reader.nextInt()
        println("Введите срок вклада в месяцах")
        val dur = reader.nextInt()
        println("Введите ежемесячный процент по вкладу в %")
        val per: Double = reader.nextDouble()
        println("Общий прирост процентов по месяцам:")
        for (u in 1..dur) {
            println("$u месяц: ${sum * per / 100 * u} тыс. руб.")
        }

        // Задание 9
        val countries = Array(3, { Array(3, { "" }) })
        countries[0] = arrayOf("Россия", "Индия", "Индонезия")
        countries[1] = arrayOf("Москва", "Дели", "Джакарта")
        countries[2] = arrayOf("Рубль", "Индийская рупия", "Индонезийская рупия")
        val country1 = Array(3, { Array(3, { "" }) })

        for (country in 0 until countries.size) {
            for (cell in 0 until countries[0].size) {
                country1[country][cell] = countries[cell][country]
            }
        }

        for (i in country1) {
            for (j in i) {
                print("$j \t")
            }
            println()
        }

        //Задание 10
        println(
            """Выберите действие (введите номер действия):
        |1. Добавить название города
        |2. Посмотреть в консоли список всех добавленных городов
        |3. Посмотреть список добавленных городов без повторений
        |4. Выход из программы
         """.trimMargin()
        )
        val choise = reader.nextInt()
        var cities = mutableListOf("Москва", "Смоленск", "Орел", "Вологда", "Орел")
        when (choise) {
            1 -> {
                val city: String
                city = readln()
                cities.add(city)
            }
            2 -> for (i in cities) {
                println(i)
            }
            3 -> println(cities.distinct())
            4 -> println("Вы вышли из программы")
            else -> println("Выберите вариант от 1 до 4")
        }

        //Задание 11

        val num: Map<Int, String> = mapOf(
            Pair(4981, "Симонов А.П."),
            Pair(521, "Иванов П.Р."),
            Pair(110, "Мирных О.Р."),
            Pair(26, "Лоскутов П.Д."),
            Pair(941, "Крисанов М.И.")
        )

        employe.putAll(num)
        println(
            """Выберите действие:
        |1. добавить сотрудника
        |2. найти сотрудника по рабочему месту
    """.trimMargin()
        )
        val choise1 = reader.nextInt()
        when (choise1) {
            1 -> {
                addEmploy()
                println(
                    """Добавить еще сотрудника?
                |1. Да
                |2. Нет
                |3. Вывести список сотрудников
            """.trimMargin()
                )
                val ans1 = reader.nextInt()
                if (ans1 == 1) addEmploy()
                if (ans1 == 3) println(employe)
            }
            2 -> {
                println("Введите номер рабочего места")
                val num2 = reader.nextInt()
                println(employe.get(num2))
            }
            else -> println("Вы вышли из программы")
        }


        // Модуль 1
        // Задание 1
        var a: Any? = null
        a = 10
        val b = a / 2.5 // double

        // Задание 2
        val str = "hello"
        val str1 = "aplana"
        println(str + " " + str1)

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
        var userText: String? = readLine()
        var stringText: String = userText.toString()
        println("Привет, $stringText")

        //Задание 5

        for (x in 'z' downTo 'a') {
            println(x)
        }

        // Задание 6

        println("Введите число а")
        val a1: Int = reader.nextInt()
        println("Введите число b")
        val b1: Int = reader.nextInt()
        var c = true
        if (a1 > b1) {
            println(c)
        } else {
            c = false
            println(c)
        }

    }

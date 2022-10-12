abstract open class Aircraft (protected var numberPlane : Int, protected var flightRange : Int, protected var tankCapacity : Int) {

    var fuelConsumption : Int = 1
    get() = tankCapacity/flightRange*100

    open fun printInfo (){
        println("""Номер воздушного судна: $numberPlane
            |Максимальная дальность полета: $
            |Вместимость бака: $tankCapacity
            |Расход топлива на 100 км: $fuelConsumption
        """.trimMargin())

    }


}
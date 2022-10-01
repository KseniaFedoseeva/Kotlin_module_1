class Boeing747 (numberPlane: Int, flightRange: Int, tankCapacity: Int, override val pass: Int) : Aircraft (numberPlane, flightRange,
    tankCapacity), Passenger
{
 override fun printInfo (){
     println("""Номер воздушного судна: $numberPlane
            |Максимальная дальность полета: $flightRange
            |Вместимость бака: $tankCapacity
            |Расход топлива на 100 км: $fuelConsumption
            |Вместимость пассажиров: $pass
        """.trimMargin())

 }
}
class Cy34 (numberPlane: Int, flightRange: Int, tankCapacity: Int, override val rockets : Int = 6) : Aircraft (numberPlane, flightRange,
    tankCapacity), Armament {
    override fun printInfo () {
        println(
            """Номер воздушного судна: $numberPlane
            |Максимальная дальность полета: $flightRange
            |Вместимость бака: $tankCapacity
            |Расход топлива на 100 км: $fuelConsumption
            |Управляемые авиационные ракеты «воздух-воздух» Р-73: $rockets
        """.trimMargin()
        )
    }
}
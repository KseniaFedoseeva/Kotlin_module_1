class An70 (numberPlane: Int, flightRange: Int, tankCapacity: Int, override val tonnage : Int = 70) : Aircraft (numberPlane, flightRange,
    tankCapacity), Tonnage {
    override fun printInfo () {
        println(
            """Номер воздушного судна: $numberPlane
            |Максимальная дальность полета: $flightRange
            |Вместимость бака: $tankCapacity
            |Расход топлива на 100 км: $fuelConsumption
            |Максимальная грузоподъемность: $tonnage
        """.trimMargin()
        )
    }
}
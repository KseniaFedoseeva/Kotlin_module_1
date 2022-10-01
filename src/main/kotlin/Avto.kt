data class Avto(var brand: String, var color: String, var num : String){
    fun printInfoAvto(){
        println("""данные автомобиля:
            |бренд: $brand
            |цвет: $color
            |номер: $num
        """.trimMargin())
    }
}

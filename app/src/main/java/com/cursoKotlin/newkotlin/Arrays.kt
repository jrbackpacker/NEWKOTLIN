package com.cursoKotlin.newkotlin

fun main() {

    val diasSemana = arrayOf(
        "Lunes", "Martes", "Miercoles", "Jueves",
        "Viernes", "Sabado", "Domingo"
    )

    println(diasSemana.size)

    if (diasSemana.size >= 8) {

        println(diasSemana[7])

    } else {
        println("No hay mas valores en el array")
    }
    //Modificar valores

    diasSemana [0] = "Dia Feote"
    println(diasSemana[0])

    //Bucles para arrays

    for(position in diasSemana.indices){
        println(diasSemana[position])
    }

    for ((position, value) in diasSemana.withIndex() ){
    println("La posicion $position, contiene $value")
    }

    for(weekDay in diasSemana){
        println("Ahora es $weekDay")
    }
}
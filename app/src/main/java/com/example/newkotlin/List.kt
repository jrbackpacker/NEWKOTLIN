package com.example.newkotlin



fun main() {


    mutableList()
    inmutableList()
}

fun mutableList(){

    val diasSemana:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves",
    "Viernes", "Sabado", "Domingo")
    //podemos añadir un valor con posicion exacata en la lista utilizando inex =...
    diasSemana.add(index = 3, "JesusDay")
    println(diasSemana)

}

fun inmutableList() {

    val readOnly: List<String> = listOf(
        "Lunes", "Martes", "Miercoles", "Jueves",
        "Viernes", "Sabado", "Domingo"
    )

    //modos para pedir datos de una lista

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())


    //modo de filtro

    val example = readOnly.filter { it.contains("a") }
    println(example)

    //Iterar

    readOnly.forEach { weekDay -> println(weekDay) }

}




package com.cursoKotlin.newkotlin

fun main() {


    ifAnidado()
    ifBasico()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleOr()


}


fun ifMultipleOr() {
    var pet = "cat"
    var isHappy = true

    //con el simbolo || (Or) conseguimos otra condicio,
    // aqui tenemos si pasa esto o lo otro y algo mas.

    if (pet == "dog" || (pet == "cat" && isHappy)) {

        println("Es un perro o un gato")
    }
}

fun ifMultiple() {

    var age = 18
    var parentPermission = true
    var imHappy = false

    //añadiendo los simbolos && podemos añadir condiciones sin abusar de los if

    if (age >= 18 && parentPermission && imHappy) {

        println("puedo beber cerveza")
    } else {
        println("No puedes beber")
    }
}

fun ifInt() {
    var age = 18

    if (age >= 18) {

        println("Puedes beber cerveza")
    } else {

        println("Te bebes un zumo")
    }
}

fun ifBoolean() {

    var soyFeliz: Boolean = true

    //tal y como esta siempre sera true
    // al poner el signo ! se vuelve lo contrario (false)
    //if (!soyFeliz) {
    //        println("Estoy amargado :(")
    //    }

    if (soyFeliz) {
        println("Estoy contento")

    }
}

/**
 * Con el if anidado podemos simplificar varias condiciones
 */

fun ifAnidado() {

    val animal = "fish"

    if (animal == "dog") {
        println("Es un perro")
    } else if (animal == "cat") {
        println("Es un gato")
    } else if (animal == "bird") {
        println("Es un pajaro")
    } else {
        println("No es un animal esperado")
    }
}

fun ifBasico() {
    val name = "Jesus"
    if (name == "Pepe") {
        println("El nombre es correcto")
    } else {
        println("Este no es Jesus")
    }
}



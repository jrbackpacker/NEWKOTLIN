package com.example.newkotlin

fun main() {

    /**
     *variables
     **/
    val age = 30
    val age1 = 30
    val floatt = 30.5f
    val doubllee = 3241.3215

    /**
     * variables Alfanumericas
     */

    //char

    var charExample: Char = '@'

    //String

    val stringExample: String = "234"
    val stringExample1: String = "234"


    //Boolean

    var booleanExample: Boolean = true


    println("Sumar:")
    println(age + age1)

    println("Restar:")
    println(age - age1)

    println("Multiplicar:")
    println(age * age1)

    println("Dividir:")
    println(age / age1)

    println("Modulo:")
    println(age % age1)

    //Entre operaciones de diferentes tipo de datos el resultado sera reconvertido,
    // si sumo un INT a un FLOAT el resultado será un FLOAT

    println("Suma entre diferentes tipos de datos:")
    println(age + floatt)

    // La suma de dos variables de tipo string da como resultado la concatenacion.

    // para realizar un salto de linea usamos \n

    println("Suma de dos strings: \n")
    println(stringExample + stringExample1)

    //convertimos el tipo de dato con el termino "to"

    println("Suma de dos strings convertidos a int: ")
    println(stringExample.toInt() + stringExample1.toInt())

    println("Llamamos a una variable dentro de un string:")
    val stringNombre: String = "jesus"

    //para hacer referencia a una variable necesitamos poner delante el simbolo $
    val stringConcatenada: String = "Me llamo $stringNombre"
    println(stringConcatenada)

}


package com.example.newkotlin

import android.net.wifi.aware.WifiAwareDataPathSecurityConfig

/**
 *
 * algunos ejemplos de funcionalidad
 **/


fun main() {

    showMyName()
    showMyAge(42)
    add(25, 76)


}

//lo que hacemos es llamar desde la funcion main a las demas funciones

fun showMyName() {

    println("me llamo jesus")
}
//con current conseguimos agregar los valores en el main sin tener que buscar en la funcion

fun showMyAge(currentAge: Int) {

    println("tengo $currentAge años")
}

//la funcion add suma los valores

fun add(firstNumber: Int, secondnumber: Int) {

    println(firstNumber + secondnumber)

}





package com.example.newkotlin


fun main() {

    getMonth(month = 1123)

    getTrimester(month = 2)

    getSemester(month = 1)

}

fun getSemester(month: Int) {

    when (month) {

        //De este modo podemos usar los rangos entre valores

        in 1..6 -> println("Es el primer Semestre")
        in 6..12 -> println("Es el segundo semestre")
        else -> println("No es un semestre valido")
    }
}


    fun getTrimester(month: Int) {

        when (month) {


            1, 2, 3 -> println("Primer Trimestre")
            4, 5, 6 -> println("Segundo Trismetre")
            7, 8, 9 -> println("Tercer Trimestre")
            10, 11, 12 -> println("Cuarto Trimestre")
            else -> println("No es un trimestre valido")

        }

    }

    fun getMonth(month: Int) {

        when (month) {

            1 -> println("Enero")
            2 -> println("Febrero")
            3 -> println("Marzo")
            4 -> println("Abril")
            5 -> println("Mayo")
            6 -> println("Junio")
            7 -> println("Julio")
            8 -> println("Agosto")
            9 -> println("Septiembre")
            10 -> println("Octubre")
            11 -> println("Noviembre")
            12 -> println("Diciembre")
            else -> println("No es un mes correcto")

        }


    }

package com.example.estudocollections

    fun main() {
        val values = IntArray(5)
        values[0] = 10
        values[1] = 2
        values[2] = 4
        values[3] = 9
        values[4] = 15


    for (valor in values) {
        println(valor)
    }

    println("-----------------")
    values.forEach {
        println(it)
    }

    println("-----------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("-----------------")
    values.sort()
        for (valor in values) {
            println(valor)
        }
    }





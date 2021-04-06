package com.example.estudocollections

    fun main() {
        val values = intArrayOf(1, 9, 12, 35, 15, 55, 3)

        for (valor in values) {
            println(valor)
        }

    println("-----------")
        values.sort()
        values.forEach {
            println(it)
        }

    }

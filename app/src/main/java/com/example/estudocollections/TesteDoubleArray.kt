package com.example.estudocollections

    fun main() {
        val salarios = DoubleArray(3)
        salarios[0] = 500.0
        salarios[1] = 1000.0
        salarios[2] = 25000.0

        salarios.forEach { (println(it)) }

        println("------------------")
        salarios.forEachIndexed { index, salario ->
            salarios[index] = salario * 2.0
        }
        salarios.forEach { (println(it)) }

        println("-------------------------")
        val salarios2 = doubleArrayOf(110.0, 50.0, 25.0)
        salarios2.sort()
        salarios2.forEach { println(it) }
    }
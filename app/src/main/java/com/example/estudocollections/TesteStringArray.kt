package com.example.estudocollections

    fun main() {
        val  nomes = Array(3) {""}
        nomes[0] = "Elena"
        nomes[1] = "Clara"
        nomes[2] = "Fernanda"
       
        for (nome in nomes) {
            println(nome)
        }

        println("-------------")
        nomes.sort()
        nomes.forEach { (println(it)) }

        println("-------------")
        val nomes2 = arrayOf("Roberta", "Priscila", "Gaby")
        nomes2.sort()
        nomes2.forEach { (println(it)) }
    }
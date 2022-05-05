package com.example.algoritms.medium


fun main() {
    var a = 1
    for (i in 1..10) {
        a++
        while (i <= a) {
            print(emptyList<String>())
        }
        println("\n")
    }
}
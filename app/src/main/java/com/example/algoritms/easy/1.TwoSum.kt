package com.example.algoritms.easy

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
fun main() {
    val array = arrayOf(0, 2, 2)
    println(twoSum(array, 4))
}

fun twoSum(array: Array<Int>, sum: Int): IntArray {
    val sumList = IntArray(2)
    var lastIndex = 0
    var nextIndex = 1
    while (true) {
        if (array[lastIndex] + array[nextIndex] == sum) {
            sumList[0] = lastIndex
            sumList[1] = nextIndex
            break
        } else if (nextIndex == array.size - 1) {
            lastIndex++
        } else {
            nextIndex++
        }
    }
    return sumList
}
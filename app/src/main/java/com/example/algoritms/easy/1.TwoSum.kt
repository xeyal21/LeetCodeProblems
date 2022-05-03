package com.example.algoritms.easy

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.**/
fun main() {
    val arrayList = arrayListOf(0, 2, 2)
    println(twoSum(arrayList, 4))
}

fun twoSum(arrayList: ArrayList<Int>, sum: Int): ArrayList<Int> {
    val sumList = ArrayList<Int>()
    var lastIndex = 0
    var nextIndex = 1
    while (true) {
        if (arrayList[lastIndex] + arrayList[nextIndex] == sum) {
            sumList.add(lastIndex)
            sumList.add(nextIndex)
            break
        } else if (nextIndex == arrayList.size - 1) {
            lastIndex++
        } else {
            nextIndex++
        }
    }
    return sumList
}
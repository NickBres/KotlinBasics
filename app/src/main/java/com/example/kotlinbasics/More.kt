package com.example.kotlinbasics

fun main(){

    // Lambda expressions
    // syntax: { arguments -> body }
    val sum = { a: Int, b: Int -> a + b }
    println(sum(2,3)) // prints 5
    val arrayAvg = { array: Array<Int> -> array.sum() / array.size }
    // can be defined with explicit types
    val max: (Int, Int) -> Int = { a, b -> if (a > b) a else b }

    // Exception handling
    // try-catch-finally. also can be used as an expression
    // can be more than one catch block for different types of exceptions
    try { // try to execute this block of code
        val x = 1 / 0
    } catch (e: Exception) { // if an exception is thrown, catch it and execute this block of code
        throw Exception("Cannot divide by zero")
    } finally { // execute this block of code no matter what
        println("Finally block")
    }


}
package com.example.kotlinbasics

fun main() {

    // var - variable (may be changed)
    // val - value (immutable - like final in Java)
    // TODO: you can use TODO to mark a TODO task in the code it will show up in the TODO tab below

    var age = 10
    val id = 123
    var name = "John"
    age = 12
    //id = 1234 // error

    //Integers (explicitly defined)
    var b: Byte = 8
    var s: Short = 16
    var i: Int = 32
    var l: Long = 64L // L is required for Long
    // can use _ to make it more readable
    var l2 = 123_456_789_123_456_789L
    var i2 = 123_456_789
    println(l2) // prints 123456789123456789

    //Floats (explicitly defined)
    var f: Float = 32.32F
    var d: Double = 64.64
    // by default, floating point numbers are double. to make it float, add F at the end

    //Text
    val myStr = "Hello World"
    var c = myStr[myStr.length - 1]
    println(c) // prints d
    println("Hello World " + name) // regular concatenation
    println("Hello World $name") // string template (better)
    // string template can also be used for expressions with ${expression}
    println("Name length: ${name.length}") // prints 11


    //boolean
    var isTasty = true
    isTasty = false

    //Arithmetic Operators (+, -, *, /, %) like in Java
    var plus = 4 + 2 // 6
    plus += 1 // 7
    val minus = 4 - 2 // 2
    val multiply = plus * minus // 14
    // casting
    val divide = multiply / 2.0 // 7.0 double
    val divide2 = (multiply / 2.0).toInt() // 7 int

    //Comparison Operators (==, !=, >, <, >=, <=) like in Java
    val isEqual = 5 == 5 // true
    val isNotEqual = 5 != 5 // false
    val isGreater = 5 > 3 // true
    println("isEqual : $isEqual") // prints true

    //Assignment Operators (+=, -=, *=, /=, %=) like in Java
    var a = 5
    a += 2 // 7
    a -= 2 // 5

    //Increment and Decrement Operators (++, --) like in Java
    var x = 5
    x++ // 6
    x-- // 5
    ++x // 6
    --x // 5

    // if statements like in Java
    if (age >= 21) {
        println("You can drink")
    } else if (age >= 18) {
        println("You can vote")
    } else if (age >= 16) {
        println("You can drive")
    } else {
        println("You can't do much")
    }

    // when statements like switch in Java
    var num = 1
    when (num) {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        else -> println("None") // default
    }
    // can use brackets to group cases
    when (num) {
        0, 1, 2 -> println("0, 1, or 2")
        else -> println("None")
    }
    // can use ranges
    when (num) {
        in 0..10 -> println("0 to 10")
        in 11..20 -> println("11 to 20")
        else -> println("None")
    }

    // can use { } to group statements
    var isRainy = true
    when (isRainy) {
        true -> {
            println("It's raining")
            println("Take an umbrella")
        }

        false -> {
            println("It's not raining")
            println("No need for an umbrella")
        }
    }

    // can use 'is' to check type (also can use !is)
    var obj: Any = "I am a string" // Any is like Object in Java (superclass of all classes)
    when (obj) {
        is Int -> println("Int")
        is String -> println("String")
        is Double -> println("Double")
        else -> println("None")
    }

    // can use if statements as expressions
    var age2 = 20
    var isAdult = if (age2 >= 18) true else false
    var isAdult2 = if (age2 >= 18) {
        println("Adult")
        true
    } else {
        println("Not Adult")
        false
    }
    // can use when statements as expressions
    var num2 = 1
    var str = when (num2) {
        0 -> "Zero"
        1 -> "One"
        2 -> "Two"
        else -> "None"
    }

    // while loop like in Java
    var i3 = 0
    while (i3 < 5) {
        println(i3)
        i3++
    }

    do {
        println(i3)
        i3++
    } while (i3 < 5)

    // for loop is like in Python using ranges
    for (i4 in 0..5) { // 0 to 5 inclusive
        println(i4)
    }
    // can use step to skip
    for (i5 in 0..5 step 2) { // 0, 2, 4
        println(i5)
    }
    /* IN examples
       in 3..5 (range 3 to 5)
       in 12..2 (range 12 to 2)
       in 12 downTo 2 (can also use downTo instead of ..)
       in 2 until 12 (can also use until instead of ..)
       in<..<12 (half-open range 1 to 11)
       in<=..<12 (closed range 1 to 11)
       in<=..<=12 (closed range 1 to 12)
       !in 3..5 (can use ! for not in)
    */

    // can use break and continue like in Java
    for (i6 in 0..5) {
        if (i6 == 3) { // stop at 3
            break
        }
        println(i6) // 0, 1, 2
    }
    for (i7 in 0..5) {
        if (i7 == 3) { // skip 3
            continue
        }
        println(i7) // 0, 1, 2, 4, 5
    }

    // functions
    myFunction()
    println("4+5=${add(4, 5)}")
    /*
    Parameters: Parameters are the variables that are listed as part of a function definition.
    They act like placeholders for the values that will be passed into the function when it's called.
    Arguments: Arguments are the actual values that are passed into a function when it is invoked.
    Method: A method is a function that is associated with an object in object-oriented programming.
    Function: A function is a named section of a program that performs a specific task.
    for more https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
    */

    //nullables
    // in regular variables, you can't assign null to it
    // var name: String = null // error
    // to make a variable nullable, use ?
    var someStr: String? = null // ok
    // oldfasion way to check null also works
    if (someStr != null) {
        println(someStr.length)
    }
    // instead of above, use safe call operator ?
    println(someStr?.length) // prints null
    // ? safe operaor can be chained (person?.address?.country?.name)
    println(someStr?.substring(0, 3)?.length) // prints null

    // another way to check null is to use .let{}
    someStr?.let {// if someStr is not null, execute the code in let{}
        println(it.length)
    }

    // to assign a nullable variable to a non-nullable variable, can use elvis operator ?:
    var someStr2 = someStr ?: "default" // if someStr is null, assign "default" to
    // this also can be used in chain (person?.address?.country?.name ?: "default")

    // to enforce non-null, use !! operator
    var someStr3 = someStr!! // if someStr is null, throws NullPointerException
    println(someStr!!.length) // if someStr is null, throws NullPointerException


} // end of main function


// function syntax
// fun name(param: type, param: type): return type {code}
fun myFunction() {
    println("Hello World")
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun avg(a: Double,b: Double): Double{
    return (a+b)/2
}

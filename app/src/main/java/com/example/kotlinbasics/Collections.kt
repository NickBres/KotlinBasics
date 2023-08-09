package com.example.kotlinbasics

fun main(){
    // Arrays
    // can be created using arrayOf() function with different types of elements
    // arrays are not dynamic in size (size cannot be changed)
    var someCollection = arrayOf(1,"Hello", 2.0, true)

    // int,double,boolean ... (every primitive type has a corresponding class)
    var intCollection = intArrayOf(1,2,3,4,5)
    var doubleCollection = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
    // or can be specified with the specific type
    var otherCollection = arrayOf<Int>(1,2,3,4,5) // can be any type instead of Int

    // can also be created using the Array constructor (lambda expression)
    var intCollection2 = Array(5){i -> i} // [0,1,2,3,4]
    var intCollection3 = Array(5){i -> i * 2} // [0,2,4,6,8]
    var otherCollection2 = Array(5){i -> i.toString()} // ["0","1","2","3","4"]

    // multidimensional arrays (arrays of arrays)
    var multiArray = Array(5){Array(5){i -> i}} // [[0,1,2,3,4],[0,1,2,3,4],...]
    var multiArray2 = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9)) // [[1,2,3],[4,5,6],[7,8,9]]

    // accessing elements same as Java
    println(intCollection[0]) // prints 1

    // looping through arrays (more like Python)
    for (element in intCollection){ // by element
        print("$element, ")
    }
    println()
    for (index in intCollection.indices){ // by index
        print("$index, ")
    }
    println()
    for ((index,element) in intCollection.withIndex()){ // by index and element
        print("$index:$element, ")
    }
    println()

    // there are many useful functions for arrays. some examples:
    println(intCollection.count()) // prints 5
    println(intCollection.contains(3)) // prints true
    println(intCollection.size) // prints 5
    println(intCollection.isEmpty()) // prints false
    println(intCollection.reversed()) // prints [5,4,3,2,1]
    println(intCollection.sorted()) // prints [1,2,3,4,5]
    println(intCollection.sum()) // prints 15
    intCollection.map { it * 2 } // returns new array with elements multiplied by 2
    intCollection.filter { it % 2 == 0 } // returns new array with even elements
    intCollection.reduce({acc, i -> acc + i}) // returns sum of all elements (15)
    intCollection.forEach { println(it) } // prints all elements in a new line
    intCollection.plus(6) // returns new array with 6 added to the end

    // Lists
    // lists are dynamic in size (size can be changed)
    // lists are immutable by default (cannot be changed)
    val list = listOf(1,2,3,4,5) // immutable list
    val mutableList = mutableListOf(1,2,3,4,5) // mutable list

    // accessing and looping trough elements same as arrays
    for (index in list.indices){
        print("${list[index]}, ")
    }
    println()

    // lists have the same functions as arrays
    println(list.count()) // prints 5
    println(list.contains(3)) // prints true


    // Sets
    // sets same as lists are dynamic in size and immutable by default
    val set = setOf(1,2,3,4,5,5,2) // immutable set (no duplicates)
    val mutableSet = mutableSetOf(1,2,3,4,5) // mutable set

    // accessing and looping trough elements same as arrays but without [] brackets
    for (index in set.indices){
        print("${set.elementAt(index)}, ")
    }

    // sets have the same functions as arrays
    println(set.count()) // prints 5 (no duplicates)
    println(set.contains(3)) // prints true

    // Maps
    val map = mapOf(1 to "one", 2 to "two", 3 to "three") // immutable map
    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three") // mutable map

    // accessing and looping trough elements same as arrays
    for(key in map.keys){
        println("$key: ${map[key]}")
    }

    // ArrayLists
    // ArrayLists are dynamic in size arrays
    val arrayList = arrayListOf(1,2,3,4,5) // immutable ArrayList
    val mutableArrayList = arrayListOf(1,2,3,4,5) // mutable ArrayList

    // adding and removing elements
    mutableArrayList.add(6) // adds 6 to the end
    mutableArrayList.add(0,0) // adds 0 to the beginning
    mutableArrayList.remove(0) // removes 0 from the beginning
    mutableArrayList.removeAt(0) // removes element at index 0
    mutableArrayList.removeIf { it % 2 == 0 } // removes all even elements
    mutableArrayList.clear() // removes all elements














}
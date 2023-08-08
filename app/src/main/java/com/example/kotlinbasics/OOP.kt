package com.example.kotlinbasics

fun main(){
    var iphone = Phone("iOs","Apple","iPhone 15")
    var samsung = Phone("Android", "Samsung","Galaxy s24")
    iphone.makeACall()
    samsung.makeACall()
}

class Phone(osName: String = "No os",brand: String = "No brand",model: String = ""){
    // Member Variables/Properties
    var osName = osName
    var brand = brand
    var model = model

    // Initializer block like a contructor
    init {
        println("Phone $model of brand $brand with $osName os has been created")
    }

    // Member functions/Methods
    fun makeACall(){
        println("$model is calling")
    }
}

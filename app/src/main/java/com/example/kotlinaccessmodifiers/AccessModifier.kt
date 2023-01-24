package com.example.mylibrary.com.example.kotlinaccessmodifiers

open class AccessModifier {
    private var privateInt : Int = 100

    protected var protectedInt : Int = 200

    internal var internalInt : Int = 300

    var publicInt : Int = 400

    fun printAllProperties(){
        println(privateInt)
        println(protectedInt)
        println(internalInt)
        println(publicInt)
    }
}
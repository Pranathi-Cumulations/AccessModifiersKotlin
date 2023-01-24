package com.example.kotlinaccessmodifiers

//private, internal, and public are the types of access modifiers used for top-level declarations in Kotlin

/*
* private - available only inside the file
* Internal - available inside the same module
* public behaviours and properties are accessible throughout the project
* */

private var privateStringExample : String = "Private"

internal var internalStringExample : String = "Internal"

var publicStringExample : String = "public"

private fun privateFunction(){
    println(privateStringExample) // able to access private variable inside the same file
    println(internalStringExample)
    println(publicStringExample)
}

fun main(){
    privateFunction()
}


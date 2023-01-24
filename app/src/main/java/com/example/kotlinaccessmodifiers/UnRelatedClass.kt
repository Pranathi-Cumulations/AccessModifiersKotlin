package com.example.mylibrary.com.example.kotlinaccessmodifiers

class UnRelatedClass {
    fun printAllPropertiesFromUnrelatedClass(){
        var instance = AccessModifier()
        println(instance.internalInt)
        println(instance.publicInt)
    }
}
package com.example.mylibrary.com.example.kotlinaccessmodifiers

class AccessModifierSub : AccessModifier(){

    fun printAllPropertiesFromSubClass(){
        println(protectedInt)
        println(internalInt)
        println(publicInt)
    }

}
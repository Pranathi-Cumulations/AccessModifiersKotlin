package com.example.mylibrary.com.example.kotlinaccessmodifiers

import com.example.mylibrary.publicStringExample

//here I am trying to access the properties that are declared in another module
fun main(){
    var instance = AccessModifier()
    var subClassInstance = AccessModifierSub()
    var unRelatedInstance = UnRelatedClass()

    instance.printAllProperties()
    subClassInstance.printAllPropertiesFromSubClass()
    unRelatedInstance.printAllPropertiesFromUnrelatedClass()

    println(publicStringExample)
}
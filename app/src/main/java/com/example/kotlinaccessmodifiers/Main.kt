package com.example.mylibrary.com.example.kotlinaccessmodifiers

fun main(){
    var instance = AccessModifier()
    var subClassInstance = AccessModifierSub()
    var unRelatedInstance = UnRelatedClass()

    instance.printAllProperties()
    subClassInstance.printAllPropertiesFromSubClass()
    unRelatedInstance.printAllPropertiesFromUnrelatedClass()
}
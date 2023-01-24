package cm.example2.anotherPackage

import com.example.kotlinaccessmodifiers.internalStringExample
import com.example.kotlinaccessmodifiers.publicStringExample
//can access internal and public variables since in the same module
fun main(){
    println(internalStringExample)
    println(publicStringExample)
}
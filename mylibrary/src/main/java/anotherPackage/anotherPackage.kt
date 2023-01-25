package anotherPackage

import com.example.mylibrary.internalStringExample
import com.example.mylibrary.publicStringExample


//can access internal and public variables since in the same module
fun main(){
    println(internalStringExample)
    println(publicStringExample)
}
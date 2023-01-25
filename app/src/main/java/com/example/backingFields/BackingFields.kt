package com.example.mylibrary.com.example.backingFields

//examples for backing fields and properties



class BackingField{
    var exampleInt : Int = 5
    set(value){
        if (value>0){
            field = value
        }
    }
}


class BackingProperties{

    private var _exampleInt : Int = 8
    var exampleInt : Int
    get(){
        return _exampleInt
    }
    set(value){
        _exampleInt = value
    }

}


fun main(){
    val backingField = BackingField()
    backingField.exampleInt = 9
    println(backingField.exampleInt)

    backingField.exampleInt=-1
    println(backingField.exampleInt)


    val backingProperties = BackingProperties()
    backingProperties.exampleInt =5
    println(backingProperties.exampleInt)

}
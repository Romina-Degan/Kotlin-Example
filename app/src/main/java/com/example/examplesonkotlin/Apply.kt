package com.example.examplesonkotlin


/*
* Apply is a function that will apply a set of decriptors to an instance of a class with the described values
*Therefore you dont have to create a seperate function that can add new instances/update the values contained
* Within an instance of an object class
* */

data class Person2(var name: String, var age: Int, var about: String){
    constructor() : this("",0,"")
}

fun main(){
    val steve = Person2()
    val steveDescrip= steve.apply {
        name="Steve"
        age=167
        about="Minecraft player"
    }
    println(steveDescrip)
}
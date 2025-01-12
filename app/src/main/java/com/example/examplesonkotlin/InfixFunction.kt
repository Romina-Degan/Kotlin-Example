package com.example.examplesonkotlin

/*
* Kotlin allows for some functions to be called without using the period and brackets known as the Infix methods
* they use certain keywords as functions to make code look more like natural language
* */

fun main(){
    infix fun Int.times(str:String) = str.repeat(this)
    println(2 times "Bye")

    //The keyword to is actually a function to() that maps a value like Pair(A,B)
    val pair = "Ferrari" to "Katrina"

    infix fun String.onto(other:String) = Pair(this , other)
    val myPair = "Mclaren" to "Lucas"
    println(myPair)
    val sophia= Person("sophia")
    val claudia = Person("claudia")
    //Completley in natural language but this utilises the same functions as defined before to mutate the list of liked people
    sophia likes claudia

}
class Person(val name:String){
    //As the strcture implies, this value is a changing value of a list of peoples names that are of the Person class that can be added to the list
    val likedPeople = mutableListOf<Person>()
    /*
    * With the infix function we can create a function to take a parameter of the Person class and complete some operations to it
    * */
    infix fun likes(other:Person) {likedPeople.add(other)}

}
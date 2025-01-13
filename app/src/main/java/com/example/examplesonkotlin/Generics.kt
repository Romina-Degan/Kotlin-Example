package com.example.examplesonkotlin

/*
* Generics are a construct that is used for generalisability of using the same operation with a structre that isnt dependent on a specific value
* This may sound like a function but in functions you have to specifiy the data types in which you use but with generics you can use anything as the
* parameter values as you dont hve to specifiy the data type
*
* */


//Here a generic class is used, with a set of variable arguments E, note how this could be anything
//Then we can define functions within the generic class that can take E and preform different operations
//Greatly increasing the code reusability
class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()
    fun push (element:E) = elements.add(element)
    fun peek() : E = elements.last()
    fun pop() : E = elements.removeAt(elements.size -1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main(){
    val addList = MutableStack("hello!!","I","NEED","CAKE")
    println(addList.size())
}
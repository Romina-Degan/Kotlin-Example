package com.example.examplesonkotlin

/*
* let is something known as a scope function it allows you to transform the given variable to a value in another type
* Sometimes its used to check that the value of a variable is not set to null, known as a null check
* Actually I think thats all it does, is to check that the current variable is not null
* */

fun customPrint(s:String){
    print(s.uppercase())

}
fun main(){
    val empty = "test".let{
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str:String?){
        println("Printing \"$str\":")
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne:String?, strTwo:String?){
        strOne?.let{ firstString->
            strTwo?.let { secondString ->
                customPrint("$firstString: $secondString")
                println()
            }
        }
    }
    printNonNull(null)
    printNonNull("HYYYYY WHLPW MW DEAR FOS PLEASE FJEALP ME")
    printIfBothNonNull("HELLO", "I AM UNDER THE WATER")
}

package com.example.examplesonkotlin

import androidx.core.app.NotificationCompat.MessagingStyle.Message

/*
* VarArg allows for multiple arguments to be passed to a function, they simply need to be seperated by commas
* */

fun printAll(vararg messages: String){
    for(m in messages) println(m)
}
fun main (){
    printAll("HELP", "ME", "PLEASE")
}


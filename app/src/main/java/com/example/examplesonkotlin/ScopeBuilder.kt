package com.example.examplesonkotlin

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking(){
    doWorld2()
}
/*
* A scope builder is used to wait to run a paticular block of code, it waits for all launched children run
* then the main body of the scope will be run, this is different to the previous example that
* the other method blocks the current thread when its waiting, but the supsend will do just that,
* suspend the thread relasing the thread in use for other usages.
* */

suspend fun doWorld2() = coroutineScope {
    launch{
        delay(2000L)
        println("World2!")

    }
    launch {
        delay(1000L)
        println("World1!")
    }
    println("Hello")
}

//Both of these launches will run concurrently
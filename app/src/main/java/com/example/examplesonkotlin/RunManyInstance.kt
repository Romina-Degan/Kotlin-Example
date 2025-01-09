package com.example.examplesonkotlin

import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(50_000){//Launches 50,000 co-routines and somehow does not kill it!! Coroutines are very lightweight and dont very little memory
        launch{
            delay(5000L)
            print(".")
        }

    }
}
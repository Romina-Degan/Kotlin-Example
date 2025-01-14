package com.example.examplesonkotlin

/*
* Delegation is something different but similiar to inheritance, kotlin has native support for delegation
* Delegation objects work in the same way of inheritance but the key point is that the object does not in default
* take all of the propertied of the interface
* */

interface SoundBehaviour{
    fun makeSound()
}

class ScreamBehaviour(val n:String): SoundBehaviour{
    override fun makeSound() {
        println("${n.uppercase()}!!!!")
    }

}
class Lyrics(val n:String): SoundBehaviour{
    override fun makeSound() {
        println("WEE AREE THE CHAMPIONS, MYYY FRIEENDSSS, $n")
    }
}
//In this we access the soundbehaviour interface while also accessing the methods that has been overridden in the scream behaviour
class Freddie(n:String): SoundBehaviour by ScreamBehaviour(n)

class Lyric(n:String) : SoundBehaviour by Lyrics(n)

fun main(){
    val feddie= Freddie("Freddy Merc.")
    feddie.makeSound()
    val l= Lyric("WEEE WILL KEEP ON FIGHTING TILLL THE ENNNDDD")
    l.makeSound()
}


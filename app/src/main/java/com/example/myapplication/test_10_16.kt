package com.example.myapplication

/**
 * @author pgwstr
 * @date 2022/10/16 23:28
 */

fun main() {
    Person("xiaoming",14)
    Person2(id = 90)
    Person3(name = "jack")
    Person4()
}

private fun Person(name: String, id: Int): Int{
    println("$name,$id")
    return 1998
}

private fun Person2(name: String = "Tom", id: Int){
    println("$name,$id")
}

private fun Person3(name: String, id: Int = 21){
    println("$name,$id")
}

private fun Person4(name: String = "kaili", id: Int = 22){
    println("$name,$id")
}



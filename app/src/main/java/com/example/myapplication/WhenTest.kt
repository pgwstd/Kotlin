package com.example.myapplication

fun getSorce(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 98
    name == "Lily" -> 100
    else -> 0
}

fun main() {
    println(getSorce("Tom"))

}
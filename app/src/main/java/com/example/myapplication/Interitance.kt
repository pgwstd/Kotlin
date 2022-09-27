package com.example.myapplication

open class Human(val name: String, val age: Int)


class Teacher(name: String, age: Int): Human(name, age){
    init {
        println(this.name + " " + this.age)
    }
}
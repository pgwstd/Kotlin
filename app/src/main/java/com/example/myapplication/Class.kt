package com.example.myapplication

class EmptyClass   //自定义一个类函数

//自定义一个类，open是权限修饰，为公开的意思,不写，则是默认的意思,而私有，则是用final
open class Person{
    var name: String = ""
    var age  = 0
    fun eat(){
        println("一个无参的方法")
    }
}

fun main(){
    val empty = EmptyClass()
    val peter = Person()
    val susan = Student()
    println(empty.toString())
    peter.name = "Peter"
    peter.age = 14
    println(peter.age)
    susan.name = "Susan"
    susan.age = 20
    println(susan.age)
    peter.eat()
    susan.eat()

}


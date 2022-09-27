package com.example.myapplication

open class Human(val name: String, val age: Int)


class Teacher(name: String, age: Int): Human(name, age){ //声明一个类并且声明这个类的主构造方法(带有参数的)，又继承Human这个父类的主构造方法(带有参数的)
    init {
        println(this.name + " " + this.age)
    }
}


class Teacher2: Human{ //声明一个类并且声明这个类的主构造方法(无参数的)，又继承Human这个父类的次构造方法(无参数的)
    constructor(name: String, age: Int): super(name, age){//次构造方法(带有参数的)继承Human这个父类的主构造方法(带有参数的)必须通过super调用
        println(this.name + " " + this.age)
    }
}

fun main(){
    val teacher = Teacher("小明",18)
    val teacher2 = Teacher2("小红",28)

}
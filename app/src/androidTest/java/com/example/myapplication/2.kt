package com.example.myapplication



open class RacingCar(val position: Int)

class Mercedes(position: Int, name: String): RacingCar(position), Run {
    override fun go(position: Int,name: String) {
        println("$name:$position")
    }
}

class Ferrari(position: Int, name: String):RacingCar(position), Run {
    override fun go(position: Int,name: String) {
        println("$name:$position")
    }
}

class BMW(position: Int, name: String):RacingCar(position), Run {
    override fun go(position: Int,name: String) {
        println("$name:$position")
    }
}

interface Run{
    fun go(position: Int,name: String){
        println("车开始跑")
    }
}

fun main(){
    var M= 1
    var F= 1
    var B= 1
    var p = true
    val mercedes= Mercedes(75,"Mercedes")
    val ferrari= Ferrari(23,"Ferrari")
    val bmw=BMW(10,"BMW")
    while(p) {
        M+= ((1..5).random())
        F+= ((1..5).random())
        B+= ((1..5).random())
        mercedes.go(M,"Mercedes")
        ferrari.go(F,"Ferrari")
        bmw.go(B,"BMW")
        println("----------------------")
        if (M>= 200){
            println("The Winner is: Mercedes")
            p = false
        }
        else  if (F>= 200){
            println("The Winner is: Ferrari")
            p = false
        }
        else if (B>= 200){
            println("The Winner is: BMW")
            p = false
        }
    }
}
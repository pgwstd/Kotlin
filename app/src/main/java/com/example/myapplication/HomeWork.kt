package com.example.helloworld

import java.lang.Math.random

//Run接口与跑的方法
interface Run{
    fun go(name: String,position: Int){
        println("车开始跑")
    }
}

open class RacingCar(val position: Int)



class Mercedes(position: Int, name: String): RacingCar(position), Run {
    override fun go(name: String, position: Int) {
        println("$name:$position")

    }

}
class Ferrari(position: Int, name: String):RacingCar(position), Run {
    override fun go(name: String,position: Int) {
        println("$name:$position")

    }
}

class BMW(position: Int, name: String):RacingCar(position), Run {
    override fun go(name: String,position: Int) {
        println("$name:$position")

    }
}



fun main(){
    val M = Mercedes(75,"Mercedes")
    val F = Ferrari(23,"Ferrari")
    val B = BMW(10,"BMW")
    while (true) {
        val randoms = (1..5).random()
        M.go("Mercedes", randoms+1)
        F.go("Ferrari", randoms+1)
        B.go("BMW", randoms+1)
    }
}
package com.example.myapplication
interface Run{
    fun go(position: Int,name: String){
        println("车开始跑")
    }
}
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
fun main(){
    var MM= 1
    var FF= 1
    var BB= 1
    var K = true
    val mercedes= Mercedes(75,"Mercedes")
    val ferrari= Ferrari(23,"Ferrari")
    val bmw=BMW(10,"BMW")
    while(K) {
        MM+= ((1..5).random())
        FF+= ((1..5).random())
        BB+= ((1..5).random())
        mercedes.go(MM,"Mercedes")
        ferrari.go(FF,"Ferrari")
        bmw.go(BB,"BMW")
        println("----------------------")
        if (MM>= 200){
            println("The Winner is: Mercedes")
            K = false
        }
        else  if (FF>= 200){
            println("The Winner is: Ferrari")
            K = false
        }
        else if (BB>= 200){
            println("The Winner is: BMW")
            K = false
        }
    }
}
package com.example.myapplication


//Run接口与跑的方法
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
    var Mspend = 1
    var Fspend = 1
    var Bspend = 1
    var SW = true
    val M = Mercedes(75,"Mercedes")
    val F = Ferrari(23,"Ferrari")
    val B = BMW(10,"BMW")
    while (SW) {
        Mspend += ((1..5).random())
        Fspend += ((1..5).random())
        Bspend += ((1..5).random())
        M.go(Mspend,"Mercedes")
        F.go(Fspend,"Ferrari")
        B.go(Bspend,"BMW")
        println("----------------------")
        if (Mspend >= 200){
            println("The Winner is: Mercedes")
            SW = false
        }
        else  if (Fspend >= 200){
            println("The Winner is: Ferrari")
            SW = false
        }
        else if (Bspend >= 200){
            println("The Winner is: BMW")
            SW = false
        }
    }
}
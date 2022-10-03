package com.example.myapplication
/**
 * @author pgwstr
 * @date
 */

//方式一
//Run接口与跑的方法
//interface Run{
//    fun go(position: Int,name: String){
//        println("车开始跑")
//    }
//}
//
//open class RacingCar(val position: Int)
//
//
//class Mercedes(position: Int, name: String): RacingCar(position), Run {
//    override fun go(position: Int,name: String) {
//        println("$name:$position")
//    }
//
//
//}
//class Ferrari(position: Int, name: String):RacingCar(position), Run {
//    override fun go(position: Int,name: String) {
//        println("$name:$position")
//    }
//}
//
//class BMW(position: Int, name: String):RacingCar(position), Run {
//    override fun go(position: Int,name: String) {
//        println("$name:$position")
//    }
//}
//
//
//fun main(){
//    var Mspend = 1
//    var Fspend = 1
//    var Bspend = 1
//    var SW = true
//    val M = Mercedes(75,"Mercedes")
//    val F = Ferrari(23,"Ferrari")
//    val B = BMW(10,"BMW")
//    while (SW) {
//        Mspend += ((1..5).random())
//        Fspend += ((1..5).random())
//        Bspend += ((1..5).random())
//        M.go(Mspend,"Mercedes")
//        F.go(Fspend,"Ferrari")
//        B.go(Bspend,"BMW")
//        println("----------------------")
          //有问题，会出现两个200
//        if (Mspend >= 200){
//            println("The Winner is: Mercedes")
//            SW = false
//        }
//        else  if (Fspend >= 200){
//            println("The Winner is: Ferrari")
//            SW = false
//        }
//        else if (Bspend >= 200){
//            println("The Winner is: BMW")
//            SW = false
//        }
//    }
//}

//方式二
//interface Run{
//    fun go(position: Int,name: String){
//        println("车开始跑")
//    }
//}
//
//open class RacingCar(var position: Int)
//
//
//class Mercedes(position: Int, name: String): RacingCar(position), Run {
//    override fun go(position: Int,name: String) {
//        println("$name:$position")
//    }
//}
//
//class Ferrari(position: Int, name: String):RacingCar(position), Run {
//    override fun go(position: Int,name: String) {
//        println("$name:$position")
//    }
//}
//
//class BMW(position: Int, name: String):RacingCar(position), Run {
//    override fun go(position: Int,name: String) {
//        println("$name:$position")
//    }
//}
//
//
//fun main(){
//    var mSpend = 1
//    var fSpend = 1
//    var bSpend = 1
//    val mercedes = Mercedes(75,"Mercedes")
//    val ferrari = Ferrari(23,"Ferrari")
//    val bmw = BMW(10,"BMW")
//    while (true) {
//        mSpend += ((1..5).random())
//        fSpend += ((1..5).random())
//        bSpend += ((1..5).random())
//        mercedes.go(mSpend,"Mercedes")
//        if (mSpend >= 200){
//            println("----------------------")
//            println("The Winner is: Mercedes")
//            break
//        }
//        ferrari.go(fSpend,"Ferrari")
//        if (fSpend >= 200){
//            println("----------------------")
//            println("The Winner is: Ferrari")
//            break
//        }
//        bmw.go(bSpend,"BMW")
//        if (bSpend >= 200){
//            println("----------------------")
//            println("The Winner is: BMW")
//            break
//        }
//        println("----------------------")
//    }
//}

//方式三
interface Run{
    var name:String
    fun go()
}

open class RacingCar(var position: Int)


class Mercedes(position: Int, override var name: String): RacingCar(position), Run {
    init {
        this.position += (1..5).random()
    }
    override fun go() {
      println("$name:$position")
    }
}

class Ferrari(position: Int, name: String):RacingCar(position), Run {
    override var name: String = name
    init {
        this.position += (1..5).random()
    }
        override fun go() {
            println("$name:$position")
        }
    }


class BMW(position: Int, override var name: String):RacingCar(position), Run {
    init {
        this.position += (1..5).random()
    }
    override fun go() {
        println("$name:$position")
    }
}


fun main(){
    val mercedes = Mercedes(1,"Mercedes")
    val ferrari = Ferrari(1,"Ferrari")
    val bmw = BMW(1,"BMW")
    while (true) {
        mercedes.go()
        ferrari.go()
        bmw.go()
        if (mercedes.position >= 200){
            println("----------------------")
            println("The Winner is: Mercedes")
            break
        }
        if (ferrari.position >= 200){
            println("----------------------")
            println("The Winner is: Ferrari")
            break
        }
        if (bmw.position >= 200){
            println("----------------------")
            println("The Winner is: BMW")
            break
        }
        println("----------------------")
    }
}
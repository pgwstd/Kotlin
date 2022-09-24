package com.example.myapplication
data class Cellphone(val brand: String, val price: Float)  //声明一个有参构造方法(data修饰证明它是一个数据类)
fun main(){
    val cellphone = Cellphone("Xiaomi", 2399f)
    val cellphone2 = Cellphone("Xiao", 3399f)
    println(cellphone.toString())
    println(cellphone2.toString())
    println(cellphone.hashCode())
    println(cellphone.equals(cellphone2))

}
package com.example.myapplication

fun main(){
    println(largerNumber(7,8))
}
//自定义函数声明（获取最大值）
//fun largerNumber(num1: Int, num2: Int): Int{
//    var value = 0
//    if (num1 > num2){
//        value = num1
//    }
//    else{
//        value = num2
//    }
//    return value
//}

//简写方式一
//fun largerNumber(num1: Int, num2: Int): Int{
//    return if (num1 > num2)
//        num1
//    else
//        num2
//}

//简写方式二
//fun largerNumber(num1: Int, num2: Int): Int{
//    val max = if (num1 > num2)
//        num1
//    else
//        num2
//    return max
//
//}


//简写方式三
fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2



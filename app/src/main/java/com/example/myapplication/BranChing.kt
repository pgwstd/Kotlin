package com.example.myapplication

//fun main(){
//    //if分支学习
//    val age: Int = 15
//    if (age < 18)
//        println("末成年")
//    else
//        println("成年了")
//
//
//    println("*************")
//    val marriage = true  //定义boolean类型的变量
//    if (marriage){
//        println("为真")
//    }
//    else {
//        println("为假")
//    }
//    println("******************")
//    val gender: Any = 0
//    if (gender == 0){
//        println(0)
//    }
//    else if (gender == 1){
//        println(1)
//    }
//    else{
//        println(-1)
//
//    }
//
//}


fun main(){
    //when分支，像switch
    var input: Any = 0
    when(input){
//        0 -> println("0")
//        1 -> println("1")
//        2 -> println("2")
        in 0 .. 2 -> println("012") //从0..2这个区间都可以被输去（左闭右闭）
        else -> println(-1)
    }
}

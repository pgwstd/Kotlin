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


//fun main() {
//    //when分支，像switch
//    var input: Any = 0
//    when (input) {
////        0 -> println("0")
////        1 -> println("1")
////        2 -> println("2")
//        in 0..2 -> println("012") //从0..2这个区间都可以被输去（左闭右闭）
//        else -> println(-1)
//    }
//
//    when (input) {
//        is Int -> println("是一个整数类型的")
//        else -> println("不是整数类型的")
//    }
//}

fun main(){

    val edu: Int = 2
    val subject: Int = 2
    when(edu){
        1 -> println("专科")
        2 -> println("本科")
        3 -> println("研究生")
        4 -> println("博士")
        else -> println("专升本")

    }

    when(subject){
        1, 2 -> println("文学学士")  //两个选择
        in 3 .. 5 -> println("理学学士")  //区间选择
        6 -> println("工学学士")
        7 -> println("农学学士")
        else -> println("基他学士")
    }

}

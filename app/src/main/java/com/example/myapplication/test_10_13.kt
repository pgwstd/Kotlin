package com.example.myapplication

/**
 * @author pgwstr
 * @date 2022/10/13 23:37
 */
    val Pi = 3.14

fun main()
{
    //TODO  var 可读可改
    var name : String = "xiaoming"
    name = "xiaxia"
    println(name)
    //TODO val 只读
    val age : Int = 99
    println(age)
    val oo = 1
    println(oo)

    val nm = "公园"
    val time = 6
    println("小明在${nm}玩了$time")
    
    val isOK = true
    println("${if (isOK) "登录成功" else "登录失败"}")
}
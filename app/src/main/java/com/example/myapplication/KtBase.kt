package com.example.myapplication

/**
 * @author pgwstr
 * @date 2022/10/25 22:20
 * 匿名函数的使用
 */
fun main() {
    //函数输入输出声明
    val methodAction: () -> String

    //实现函数
    methodAction = {
        val inputValue = 999999
        //匿名函数最后一行就是返回值
        "$inputValue pgwstr"

    }
    //调用输出函数
    println(methodAction())
}
package com.example.myapplication

/**
 * @author pgwstr
 * @date 2022/10/18 18:56
 * 匿名函数学习
 */

fun main() {
    val count = "abcdef".count()
    println(count)

    //匿名函数
    val len = "abcdeff".count{
        it == 'f'   //这个字符在字符串中了出现多少次
    }
    println(len)
}

package com.example.myapplication

/**
 * @author pgwstr
 * @date 2022/10/25 23:02
 */
fun main() {

    val method1 = { v1:Double, v2:Float, v3:Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }

    println(method1(1.1, 1.5f, 2))

}
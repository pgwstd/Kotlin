package com.example.myapplication

/**
 * @author pgwstr
 * @date 2022/10/25 22:44
 */

fun main() {
    val methodAction: (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputValue = 9999
        println("$inputValue pgwstr $number1,$number2,$number3")
        "$inputValue pgwstr $number1,$number2,$number3"
    }

    methodAction(1, 2, 3)

    val methodAction2: (String) -> String = { "$it pgwstr" }
    println(methodAction2("ddd"))

    val methodAction3: (Double) -> String = { "$it   3.14" }
    println(methodAction3(520.1))
}
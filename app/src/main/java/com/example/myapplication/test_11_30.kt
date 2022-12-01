package com.example.myapplication


    fun main() {
        val num = 100   //默认是Int类型的
        val bignum = 800000000  //如果超过int的最大值，就是long类型
        val longnum = 20L   //数字后面显式加l，表明是long类型的
        val bytenum: Byte = 1 //显式声明这是byte类型的
        val dounum = 3.1415926535   //默认小数格式是double
        val flanum = 3.1415926535f  //由于float的位宽问题，只保留6位（十进制是6位，后面的小数会四舍五入）
        println(num)
        println(bignum)
        println(longnum)
        println(bytenum)
        println(dounum)
        println(flanum)
    }

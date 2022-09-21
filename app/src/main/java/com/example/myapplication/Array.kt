package com.example.myapplication


//数组练习
//fun main(){
//    val ages = arrayOfNulls<Int>(10)
//    ages[0] = 1
//    ages[1] = 2
//    ages[2] = 3
//    ages[3] = 4
//    ages[4] = 5
//    ages[5] = 6
//    ages[6] = 7
//    ages[7] = 8
//    ages[8] = 9
//    ages[9] = 10
//    var maxAge = 0
//    for (age in ages){
//        age ?: continue //判断age是否为空，如果是空执行后面的语句跳出本次循环
//        if (age > maxAge){  //比较age是否大于maxAge，如果大于就把age给maxAge
//            maxAge = age
//        }
//    }
//    println("最大值是:$maxAge")
//}


//fun main(){
//    val ageArray: IntArray = intArrayOf(19, 15, 26, 8, 45)
//    val nameArray: Array<String> = arrayOf("kk", "bb", "cc", "dd","pp")
//    for (i in ageArray.indices){ //获取这个ageArray.indices的长度,来循环遍历
//        print(nameArray[i] + ":")
//        println(ageArray[i])
////        println("${nameArray[i]} : ${ageArray[i]}")
//    }
//
//}


//fun main() {
//    val ageArray: IntArray = intArrayOf(19, 15, 26, 8, 45)
//    val nameArray: Array<String> = arrayOf("kk", "bb", "cc", "dd","pp")
//
//
//    //repeat重要多少次，其中it是目前它重复的次数,从0开始到重复结束
//    repeat(5){
//        print(nameArray[it] + ":")
//        println(ageArray[it])
////        println("${nameArray[i]} : ${ageArray[i]}")
//    }
//
//}


fun main() {
    var height = emptyArray<Int>()
    println("没装东西的数组长度${height.size}")
    height = arrayOf(123, 45, 12313, 123, 5)
    println("装了东西的数组长度${height.size}")

    //二维数组
    val students = Array(5) { IntArray(3) }
    students[0][0] = 157234
    students[0][1] = 82
    students[0][2] = 69
    students[1][0] = 157236
    students[1][1] = 43
    students[1][2] = 77
    students[2][0] = 157238
    students[2][1] = 76
    students[2][2] = 88
    students[3][0] = 157240
    students[3][1] = 89
    students[3][2] = 92


}
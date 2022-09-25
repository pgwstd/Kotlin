package com.example.myapplication

//方式一
//fun getSorce(name: String) = when {
//    name.startsWith("Tom") -> 86  //startsWith检测是否以指定字符开始
//    name == "Jim" -> 77
//    name == "Jack" -> 98
//    name == "Lily" -> 100
//    else -> 0
//}

//方式二
//fun getSorce(name: String) = when (name) {
//    "Tom" -> 86  //startsWith检测是否以指定字符开始
//    "Jim" -> 77
//    "Jack" -> 98
//    "Lily" -> 100
//    else -> 0
//}


//方式三
fun getSorce(name: String) =
    if (name == "Tom") {
        86
    } else if (name == "Jim") {
        77
    } else {
        0
    }


fun main() {
    println(getSorce("Tom"))

}

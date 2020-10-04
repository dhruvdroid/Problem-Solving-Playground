//package problemSolving
//
//import java.io.*
//import java.math.*
//import java.security.*
//import java.sql.DriverManager
//import java.text.*
//import java.util.*
//import java.util.concurrent.*
//import java.util.function.*
//import java.util.regex.*
//import java.util.stream.*
//import kotlin.collections.*
//
//
//fun main(args: Array<String>) {
//    val itemsCount = readLine()!!.trim().toInt()
//
//    val items = Array<Int>(itemsCount, { 0 })
//    for (i in 0 until itemsCount) {
//        val itemsItem = readLine()!!.trim().toInt()
//        items[i] = itemsItem
//    }
//
//    val result = itemsSort(items)
//
//    //println(result?.joinToString("\n"))
//}
//
//
//// Complete the rotLeft function below.
//fun itemsSort(items: Array<Int>): Array<Int>? {
//    // Write your code here
////    val valueMap = hashMapOf<Int,Int>()
////    items.forEach {
////        if(!valueMap.containsKey(it)){
////            valueMap.put(it, 1)
////        }else if(valueMap.containsKey(it)){
////            var count = valueMap[it]
////            count = count!!++
////            valueMap.put(it, count)
////        }
////        println(it)
////    }
//
//    return null
//}
//

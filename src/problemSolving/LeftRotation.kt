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
//    val scan = Scanner(System.`in`)
//
//    val nd = scan.nextLine().split(" ")
//
//    val n = nd[0].trim().toInt()
//
//    val d = nd[1].trim().toInt()
//
//    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
//
//    val result = rotLeft(a, d)
//
//    println(result.joinToString(" "))
//}
//
//
//// Complete the rotLeft function below.
//fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
//
//    for (i in 0..a.size-1) {
//        print(a[i])
//    }
//
//    return arrayOf()
//}
//

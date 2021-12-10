
/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    println("Hello, world!!!")

    val list = mutableListOf<String>(App)
}

data class App(
        val appName: String,
        val packageName: String,
        val activityName: String,
        val userSerial : Long
){
 }


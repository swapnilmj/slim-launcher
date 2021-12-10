
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


/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

data class App(
        val appName: String,
        val packageName: String,
        val activityName: String,
        val userSerial : Long
){
    
    companion object{
        
        
    }
    
}


fun main() {
    println("Hello, world!!!")

    val list = mutableListOf<App>()
    val fooSequence = generateSequence(1, { it + 2 })
    var launcher_act_list = fooSequence.take(10).toList()
    println(launcher_act_list)
    
             for (activityInfo in launcher_act_list) {
                 val app = App(
                         appName = activityInfo.toString(),
                         packageName = activityInfo.toString(),
                         activityName = activityInfo.toString(),
                         userSerial = 111
                 )
                 list.add(app)
             }
         

}

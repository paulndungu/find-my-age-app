import java.util.*
import java.util.spi.CalendarDataProvider
import kotlin.reflect.full.IllegalCallableAccessException

fun main(){

//    input
    println("Enter your year of birth: ")
    var age:Float= readLine()!!.toFloat()

//    process
//    var output= 2019 - age
    var calender= Calendar.getInstance().get(Calendar.YEAR)

//    output
    var out=calender -age
    println("you are $out years old")

}
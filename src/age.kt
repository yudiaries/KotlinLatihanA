/**
 * Created by SAINTEK 101 on 9/30/2017.
 */
fun main(args:Array<String>){
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    var year=2017
    var Age:Int?
    Age=year-DOB

    println("your age is$Age yerars")

}
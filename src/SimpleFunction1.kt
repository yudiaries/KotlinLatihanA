fun disply(n:Int=0):Unit{
    println("n:$n")
}
fun displyNoInput():Unit{
    println("Welcome To Display")
}

fun main(args: Array<String>) {
    disply(10)
    disply()

    displyNoInput()
}
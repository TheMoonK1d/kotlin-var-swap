fun main() {
   //Value Swap
    println("Enter 1st number")
    var num1 : Int = readln().toInt()
    println("Original value of num1 = $num1")
    println("Enter 2nd number")
    var num2 : Int = readln().toInt()
    println("Original value of num2 = $num2")

    val temp : Int = num1 //Declare and initialize temp with the first number
    num1 = num2
    num2 = temp

    println("New value of num1 = $num1")
    println("New value of num2 = $num2")
}
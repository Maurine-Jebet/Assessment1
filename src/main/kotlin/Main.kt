fun main() {

    println(addition(13,26))
    println(subtraction(15,8))
    println(division(15,3))
    println(multiplication(5,5))
    sentence()


    }




fun sentence(){
    var name = "morin"
    var sentence = (name+"is running to school")
    println(sentence)
}
fun numbers(){
    var numArray = arrayOf(15,20,25,30)
    println(numArray.sort())
}

    fun addition(num1:Int,num2:Int,):Int{
        var addition = num1 + num2
        return (addition)
}
fun subtraction(num1:Int,num2:Int):Int{
    var subtraction = num1 - num2
    return (subtraction)
}
fun division(num1:Int,num2:Int):Int{
    var division = num1 / num2
    return (division)

}
fun multiplication(num1:Int,num2:Int):Int{
    var multiplication = num1 * num2
    return (multiplication)

}

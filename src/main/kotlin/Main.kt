import java.awt.geom.Arc2D

fun main() {
    greetPerson("Rebecca"
    )
    var s=remainder(32,10)
    println (s)
    var z=sum(3221,2321,3452,3456)
    println(z)
    var x= "life can be grey too"
    println(x)

}
fun greetPerson(name:String){
    println("Hello $name")
}
fun remainder(num1:Int, num2: Int):Int{
    return (num1%num2)
}
fun sum(num1: Long,num2:Long,num3:Long,num4:Long):Long{
    return(num1 + num2 +num3 + num4)

}fun me(interestingFact:String):String{
    return(interestingFact)
}
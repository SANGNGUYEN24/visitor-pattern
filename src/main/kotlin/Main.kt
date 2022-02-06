import shape.Circle
import shape.Square
import shape.Triangle
import visitor.AreaVisitor
import visitor.AreaVisitorPlus10

fun main(){
    val areaVisitor = AreaVisitor()
    val areaVisitorPlus10 = AreaVisitorPlus10()

    val square = Square(5.0)
    val triangle = Triangle(5.0, 10.0)
    val circle = Circle(5.0)

    println(square.calculate(areaVisitor))
    println(triangle.calculate(areaVisitor))
    println(circle.calculate(areaVisitor))

    println("AREA PLUS 10")

    println(square.calculate(areaVisitorPlus10))
    println(triangle.calculate(areaVisitorPlus10))
    println(circle.calculate(areaVisitorPlus10))

}
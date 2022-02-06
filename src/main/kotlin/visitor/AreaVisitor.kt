package visitor

import shape.Circle
import shape.Square
import shape.Triangle
import kotlin.math.PI

class AreaVisitor : Visitor {
    override fun calculateArea(square: Square): Double {
        println("Square area")
        return square.sideLength * square.sideLength
    }

    override fun calculateArea(triangle: Triangle): Double {
        println("Triangle area")
        return triangle.heightLength * triangle.bottomEdgeLength / 2
    }

    override fun calculateArea(circle: Circle): Double {
        println("Circle area")
        val r = circle.radiusLength
        return PI * r * r
    }

}
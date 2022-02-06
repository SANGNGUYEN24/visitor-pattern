package visitor

import shape.Circle
import shape.Square
import shape.Triangle

interface Visitor {
    fun calculateArea(square: Square): Double
    fun calculateArea(circle: Circle): Double
    fun calculateArea(triangle: Triangle): Double
}
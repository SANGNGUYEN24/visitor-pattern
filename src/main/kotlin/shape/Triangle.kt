package shape

import visitor.Visitable
import visitor.Visitor

class Triangle(heightInput: Double, bottomEdgeInput: Double) : Visitable {
    val heightLength = heightInput
    val bottomEdgeLength = bottomEdgeInput

    override fun calculate(visitor: Visitor): Double {
        return visitor.calculateArea(this)
    }
}
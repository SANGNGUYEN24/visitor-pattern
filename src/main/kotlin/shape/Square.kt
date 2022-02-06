package shape

import visitor.Visitable
import visitor.Visitor

class Square (input: Double) : Visitable{
    val sideLength = input

    override fun calculate(visitor: Visitor): Double {
        return visitor.calculateArea(this)
    }
}
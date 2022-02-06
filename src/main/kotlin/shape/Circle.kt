package shape

import visitor.Visitable
import visitor.Visitor

class Circle (radiusInput : Double) : Visitable{
    val radiusLength = radiusInput

    override fun calculate(visitor: Visitor): Double {
        return visitor.calculateArea(this)
    }
}
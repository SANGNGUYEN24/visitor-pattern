package visitor

interface Visitable {
    fun calculate(visitor: Visitor): Double
}
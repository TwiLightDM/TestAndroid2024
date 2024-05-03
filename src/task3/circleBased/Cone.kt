package task3.circleBased

import task3.other.Figure

class Cone(override val radius: Int, override val height: Int) : Figure(), CircleBased {
    override fun surfaceArea(): Double {
        return super.surfaceArea()
    }

    override fun volume(): Double {
        return super.volume() / 3
    }
}
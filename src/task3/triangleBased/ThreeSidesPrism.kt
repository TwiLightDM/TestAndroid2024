package task3.triangleBased

import task3.other.Figure

class ThreeSidesPrism (
    override val sideA: Int,
    override val sideB: Int,
    override val sideC: Int,
    override val height: Int
) : Figure(), TriangleBased {

    override fun surfaceArea(): Double {
        return super.surfaceArea()
    }

    override fun volume(): Double {
        return super.volume()
    }

}
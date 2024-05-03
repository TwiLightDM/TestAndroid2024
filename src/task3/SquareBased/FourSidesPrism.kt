package task3.SquareBased

import task3.other.Figure

class FourSidesPrism(override val width: Int, override val length: Int, override val height: Int) : Figure(), SquareBased {
    override fun surfaceArea(): Double {
        return super.surfaceArea()
    }

    override fun volume(): Double {
        return super.volume()
    }

    fun isSquare(): Boolean {
        return width == length && length == height
    }
}
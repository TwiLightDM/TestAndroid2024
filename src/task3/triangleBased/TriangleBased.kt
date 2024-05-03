package task3.triangleBased

import kotlin.math.sqrt

interface TriangleBased {
    val sideA: Int
    val sideB: Int
    val sideC: Int
    val height: Int
    fun surfaceArea(): Double {
        val halfOfP: Double = ((sideA + sideB + sideC) / 2).toDouble()
        return sqrt(halfOfP * (halfOfP - sideA) * (halfOfP - sideB) * (halfOfP - sideC))
    }

    fun volume(): Double {
        return surfaceArea() * height
    }
}
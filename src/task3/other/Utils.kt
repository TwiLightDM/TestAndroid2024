package task3.other

import task3.triangleBased.TriangleBased

class Utils {
    companion object{
        fun calculateArea(vararg figures: Figure) {
            for (figure in figures) {
                println("У фигуры ${figure::class.simpleName} площадь равна ${figure.surfaceArea()}")
            }
        }

        fun calculateVolume(vararg figures: Figure) {
            for (figure in figures) {
                println("У фигуры ${figure::class.simpleName} объем равен ${figure.volume()}")
            }
        }

        fun calculateTriangleVolume(vararg triangles: TriangleBased) {
            for (triangle in triangles) {
                println("У фигуры ${triangle::class.simpleName}, с основанием треугольник, объем равен ${triangle.volume()}")
            }
        }
    }

}
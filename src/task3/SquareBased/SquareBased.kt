package task3.SquareBased

interface SquareBased {
    val width: Int
    val length: Int
    val height: Int


    fun surfaceArea(): Double {
        return (width * height).toDouble()
    }

    fun volume(): Double {
        return surfaceArea() * height
    }

}
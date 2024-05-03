package task3.circleBased


interface CircleBased {
    val radius: Int
    val height: Int
    fun surfaceArea(): Double {
        return Math.PI * radius * radius
    }

    fun volume(): Double {
        return surfaceArea() * height
    }

}
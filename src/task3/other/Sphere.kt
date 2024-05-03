package task3.other

class Sphere(val radius: Int) : Figure() {
    override fun surfaceArea(): Double {
        return 4 * Math.PI * radius * radius
    }

    override fun volume(): Double {
        return (4 / 3) * Math.PI * radius * radius * radius
    }
}
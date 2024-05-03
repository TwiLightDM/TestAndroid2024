package task2

fun main() {
    val arr: MutableList<Int> = mutableListOf()
    for (i in 0..<100) {
        arr.add((0..<10).random())
    }
    toCount(arr)

}

fun toCount(arr: MutableList<Int>) {
    val map = HashMap<Int, Int>()
    arr.forEach {
        if (map.contains(it)) {
            map[it] = map[it]?.plus(1) ?: 0
        } else {
            map[it] = 1
        }
    }
    printHashMap(map)
}

fun printHashMap(map: HashMap<Int, Int>) {
    map.forEach { (key, value) ->
        println("Число $key встречалось $value раз")
    }
}

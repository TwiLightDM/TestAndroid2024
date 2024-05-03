package task1

fun main() {
    val arr: MutableList<Int> = mutableListOf()
    for (i in 1..100){
        arr.add(i)
    }
    arr[70] = 2
    search(arr)
}

fun search(arr: MutableList<Int>){
    val set = HashSet<Int>()
    arr.forEach{
        if (set.contains(it)){
            println("$it встречается более одного раза")
            return
        }
        set.add(it)
    }
}
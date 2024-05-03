package task4

interface Subscriber{
    val name: String
    fun getState(degrees: Int){
        when(degrees){
            in -30..-20 -> println("$name, сегодня очень холодно, оставайтесь дома")
            in -19..-10 -> println("$name, сегодня холодно, одевайтесь теплее")
            in -9..10 -> println("$name, сегодня прохладно, не забудьте кофту и куртку")
            in 11..20 -> println("$name, сегодня тепло, самое время для прогулки")
            in 21..30 -> println("$name, сегодня жарко, самое время сходить на пляж")
            else -> println("$name, сегодня погода не известна")
        }
    }
}
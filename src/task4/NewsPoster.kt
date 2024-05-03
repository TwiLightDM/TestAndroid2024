package task4

import kotlin.random.Random

class NewsPoster {
    var degrees = 0
    private val subscribers = mutableListOf<Subscriber>()

    fun addSubscriber( subscriber: Subscriber){
        subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: Subscriber){
        subscribers.remove(subscriber)
    }

    fun updateState() {
        degrees = Random.nextInt(-30, 31)
        subscribers.forEach {
            it.getState(degrees)
        }
        readln()
        return updateState()
    }
}
package task4

import kotlin.random.Random
import kotlinx.coroutines.*

class NewsPoster {
    var degrees = 0
    private val subscribers = mutableListOf<Subscriber>()

    fun addSubscriber( subscriber: Subscriber){
        subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: Subscriber){
        subscribers.remove(subscriber)
    }

    suspend fun updateState() {
        while (true){
            degrees = Random.nextInt(-30, 31)
            subscribers.forEach {
                it.getState(degrees)
            }
            delay(5000)
        }
    }
}
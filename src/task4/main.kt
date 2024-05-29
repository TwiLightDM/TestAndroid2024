package task4

suspend fun main(){
    val newsPoster = NewsPoster()

    newsPoster.addSubscriber(Man("Иван"))
    newsPoster.addSubscriber(Woman("Ева"))
    newsPoster.addSubscriber(Man("Андрей"))

    newsPoster.updateState()
}
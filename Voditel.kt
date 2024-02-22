import dispecher.*
open class Voditel (var remont:Int,var reis:Int,var sost:Int)
{
    fun InfoV(){
 when(remont){
     1-> println("заявка на ремонт одобрена, привизите ваш автомобиль на ремонт")
 }
        when(reis){
            1-> println("Рейс выполнен")
            2-> println("Рейс не выполнен")
        }
        when(sost){
            1-> println("состояние автомобиля хорошее ")
            2-> println("состояние автомобиля среднее ")
            3-> println("состояние автомобиля плохое-создайте заявку на ремонт")
        }

    }
}
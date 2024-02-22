import dispecher.*
fun main() {
    try {
        println("Диспетчер:")
        val ab1 = Dispecher("", "", 0)
        println("напишите время рейса, которое вам нужно")
        ab1.t= readLine()!!.toString()
        println("напишите день рейса, на который вам понадобился автомобиль ")
        ab1.d= readLine()!!.toString()
        ab1.Info()
        println("Водитель:")
        val vod=Voditel(0,0,0)
        println("Понадобиться ли вам вам заяка на ремонт? 1-да   2-нет")
        vod.remont = readLine()!!.toInt()
        println("Рейс выполнен? 1-да  2-нет")
        vod.reis= readLine()!!.toInt()
        println("Какое по вашему мнению состояние автомобиля? 1-хорошее 2-среднее  3-плохое")
        vod.sost=readLine()!!.toInt()
        vod.InfoV()
        println("Диспетчер:")
        println("Вы хотите отстранить водителя от работы? 1-да   2-нет")
        ab1.o4= readLine()!!.toInt()
        ab1.InfoD()


    }
    catch(e:Exception){
        println("ошибка")
    }
}
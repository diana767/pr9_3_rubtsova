package dispecher
 class Dispecher(var t:String,var d:String, var o4:Int)
{
    open fun Info(){
        println("время рейса: $t , день рейса: $d")

    }
    open fun InfoD(){
        when(o4) {
            1 -> println("водитель отстранен от работы")
            2 -> println("водитель продолжает работу")
        }
    }
}
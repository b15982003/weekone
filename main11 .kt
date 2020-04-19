import kotlin.math.pow
open class Human(val name: String){
    class Mage : Human(name ="Mage"){
    }
}
open class Magic(){
    open fun attack(){

        println(" use First Attack! ")
    }
}
class Sense : Magic(){
        override fun attack() {
            println(" use Fireball")
        }
}
fun main(){
    val mage = Human.Mage()
    val sense = Sense()
    val magic = Magic()
    var flag = false

    println("請輸入你的魔量 ：")
    var mana:Int =Integer.valueOf(readLine())


    if (mana>=10){
    print(mage.name)
    sense.attack()

    }
    if (mana<10) {
        print(mage.name)
        magic.attack()
    }
}















open class Human(val name: String){
    open var hasMana = false
    open fun attack() {

        print(" use Fir Attack\n")
    }
}
class Mage:Human(name = "Mage"){
    override var hasMana = true
    override fun attack(){
        print(" use the fire attack\n")
    }
}
fun main() {
    var human = Human("Ray")
    var mage = Mage()

        println(human.hasMana)
        println(mage.hasMana)

        print(human.name)
        human.attack()


        print(mage.name)
        mage.attack()

}
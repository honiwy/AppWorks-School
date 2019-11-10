//4. Create a new class, Human, includes:
//a. Pass in a mandatory String argument for the name.
//b. Add a method, attack(), that print "<the name passed in> use Fist Attack!".
//c. In the main() function, create an instance of Human, and call the attack() method to print
fun main(args: Array<String>){
    val human=Human("Rachel")
    human.attack()
    val mage=Mage("Mickey")
    mage.attack()
}
open class Human(val name: String){
   open fun attack(){
        println("$name use Fist Attack!")
    }
}

//5. Create a subclass of Human; name it Mage, includes:
//a. Pass in a mandatory String argument for the name, also for the constructor of Human.
//b. Override the attack() method to print "<the name passed in> use Fireball!".
//c. In the main() function, create an instance of Mage, and call the attack() method to print.
class Mage(val nameMage:String): Human(nameMage) {
    override fun attack() {
        println("$nameMage use Fireball!" )
    }
}



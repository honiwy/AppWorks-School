//4. Create a new class, Human, includes:
//a. Pass in a mandatory String argument for the name.
//b. Add a method, attack(), that print "<the name passed in> use Fist Attack!".
//c. In the main() function, create an instance of Human, and call the attack() method to print
fun main(args: Array<String>){
val human=Human("Rachel")
    human.attack()

}
class Human(val name: String){
   fun attack(){
        println("$name use Fist Attack!")
    }
}
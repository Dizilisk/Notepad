object Main {
    case class User(name: String, number: Int) {
        override def toString: String = {
            this.name + this.number
        }
    }

//    def getKey(Map): Option[]
    def main(args: Array[String]): Unit = {
        val user1 = User("Andrey, ", 1)
        val user2 = User("Andrey2, ", 2)
        val user3 = User("Andrey3, ", 3)
        val Collection = Map(1 -> user1, 2 -> user2, 3 -> user3)
        println(Collection(1))
    }
}
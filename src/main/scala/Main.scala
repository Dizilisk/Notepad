object Main {

    case class User(name: String, number: Int) {

    }

    def main(args: Array[String]): Unit = {
        val user1 = User("Andrey", 1)
        println(user1)
    }
}


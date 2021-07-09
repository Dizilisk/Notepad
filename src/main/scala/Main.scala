object Main {

        class User {

            val user1 = new User {
                val name = "Andrey"
                val number = 1
            }
            val x = user1.name
            val y = user1.number
            println(x, y)
        }
    def main(args: Array[String]): Unit = {
        println("aaa")
    }
}


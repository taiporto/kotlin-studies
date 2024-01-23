fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    val aline = Person("Aline", 28, null, null)
    val agata = Person("Agata", 28, null, aline)

    amanda.showProfile()
    atiqah.showProfile()
    aline.showProfile()
    agata.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name\nAge: $age")
        if (hobby != null) print("Likes to $hobby. ") else println("Doesn't have a hobby.")
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if(referrer.hobby != null) {
                println(", who likes to ${referrer.hobby}.")
            } else println(".")
        } else println("Doesn't have a referrer.")
        println("")
    }
}

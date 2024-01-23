class Song(val title: String, val artist: String, val launchYear: String, val playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000 // propriedade interna
    fun presentSong(): String {
        return "$title, from $artist, launched $launchYear"
    }
}

fun main() {
    val mel = Song("Mel", "Liniker", "2021", 200000)
    val poucoAPouco = Song("Pouco a Pouco", "Os Garotin", "2023", 100)

    println(mel.presentSong())
    println(mel.isPopular)
    println(poucoAPouco.presentSong())
    println(poucoAPouco.isPopular)
}
open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true, isScreenLightOn: Boolean = false): Phone(isScreenLightOn) {
    override fun switchOn() {
        if(!isFolded) isScreenLightOn = true
    }

    fun fold(){
        isFolded = true
    }

    fun unfold(){
        isFolded = false
    }
}

fun main(){
    val s21 = Phone()
    val zFlip = FoldablePhone()

    s21.switchOn()
    s21.checkPhoneScreenLight()
    zFlip.switchOn()
    zFlip.checkPhoneScreenLight()
    zFlip.unfold()
    zFlip.switchOn()
    zFlip.checkPhoneScreenLight()
}

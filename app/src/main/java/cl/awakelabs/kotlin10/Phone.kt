package cl.awakelabs.kotlin10

open class Phone (var isScreenLightOn:Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    open fun switchOff() {
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
         println("La luz de la pantalla del telefono esta $phoneScreenLight.")
    }
}
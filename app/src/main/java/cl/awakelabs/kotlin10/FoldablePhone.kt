package cl.awakelabs.kotlin10

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn){
    var isFoldable: Boolean = false

    override fun switchOn() {
        if (!isFoldable) {
            isScreenLightOn = true
        }
    }
    fun open() {
        isFoldable = true
    }
    fun close() {
        isFoldable = false
    }
}
fun main() {
    val foldable = FoldablePhone()
    println(foldable.isFoldable)
    foldable.open()
    println(foldable.isFoldable)
}

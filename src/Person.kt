open class Person(val name: String, val age : Int) {
    override fun toString():String = "Имя: ${name}, возраст: ${age}"
    open val readableInformation: String
        get() = "${name}, ${age}"

    open fun outputInformation() : Unit{
        println("${name}, ${age}")
    }
}
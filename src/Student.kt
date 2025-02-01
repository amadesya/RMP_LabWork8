class Student(name : String, age : Int, val group : String) : Person(name, age) {
    override fun toString():String = "${super.toString()} группа: ${group}"

    override val readableInformation: String
        get() = "${super.readableInformation}, ${group}"

    override fun outputInformation() {
        println("${super.outputInformation()}, ${group}")
    }
}
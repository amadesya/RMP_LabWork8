fun main(){
    var person = Person("Чел", 34)
    var jora = Student("Жора", 64, "ИСПП-35")
    println(jora.toString())

    person.outputInformation()
    jora.outputInformation()

    var triangle = Triangle(4,6,5)
    println(triangle.name)
    println(triangle.perimeter())
    println(triangle.area())
    triangle.figureInfo()
    triangle.print()
}
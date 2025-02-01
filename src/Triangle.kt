class Rectangle: IPrinter, IFigure {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var h: Int = 0

    override fun print() {
        println("${a}, ${b}, ${c}, ${h}")
    }

    override fun area(): Double {
        return 0.5 * a * h
    }

    override fun perimeter(): Int {
        return a + b + c
    }

    override fun figureInfo() {
        println("Площадь: ${area()}, периметр: ${perimeter()}, стороны: ${a},${b},${c}")
    }

    override val name: String
        get() = "Треугольник"

}


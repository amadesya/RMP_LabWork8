import kotlin.math.sqrt

class Triangle(var a: Int, var b: Int, var c: Int): IPrinter, IFigure {
    var p: Double= a.toDouble()+b.toDouble()+c.toDouble()/2
    var h: Double = (2 / a.toDouble()) * sqrt(p * (p - a) * (p - b) * (p - c))

    fun isExist(): Boolean{
        return (a + b >= c) && (b + c >= a) && (c + a >= b)
    }

    override fun print() {
        if (isExist())
            return println("${a}, ${b}, ${c}, ${h}")
        else
            return println("Треугольник не существует")
    }

    override fun area(): Any {
        if (isExist())
            return 0.5 * a * h
        else
            return println("Треугольник не существует")
    }

    override fun perimeter(): Any{
        if (isExist())
            return a + b + c
        else
            return println("Треугольник не существует")
    }

    override fun figureInfo() {
        if (isExist())
            println("Фигура: ${name}, Площадь: ${area()}, периметр: ${perimeter()}, стороны: ${a},${b},${c}, высота: ${h}")
        else
            return println("Треугольник не существует")
    }

    override val name: String
        get() = "Треугольник"

}


import kotlin.math.*

class Circle(var radius: Int): Figure() {
    override fun area(): Double{
        return PI*radius.toDouble().pow(2.0)
    }

    override fun perimeter():Double{
        return 2*PI*radius
    }

    override fun figureInfo(): String {
        return "Периметр: ${perimeter()}, площадь: ${area()}, радиуc: ${radius}"
    }

    override val name: String
        get() = "Круг"

}
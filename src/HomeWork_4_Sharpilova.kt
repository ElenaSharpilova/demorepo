import java.util.*
import kotlin.math.sqrt

fun main() {

    val read = Scanner(System.`in`)

    println("Решение уравнения a^x2 + bx + c = 0")

    println("Введите a:")
    val a = read.nextDouble()

    println("Введите b:")
    val b = read.nextDouble()

    println("Введите c:")
    val c = read.nextDouble()

    val d: Double = (b * b) - (4 * a * c)

    when {
        (d > 0) -> {
            val firstRoot = (-b + sqrt(d)) / ( 2 * a)
            val secondRoot = (-b - sqrt(d)) / ( 2 * a)

            val output = "Корни уравнения: x1 = %.2f и x2 = %.2f"
                    .format(firstRoot, secondRoot)
            println(output)
        }
        (d == 0.0) -> {
            val firstRoot = -b / ( 2 * a)

            val output = "Корень уравнения: x1 = %.2f"
                    .format(firstRoot)
            println(output)
        }
        else -> {
            val realPart = -b / ( 2 * a)
            val imaginaryPart = sqrt(-d) / (2 * a)

            val output =
                    "Корней нет"
                            .format(realPart, imaginaryPart, realPart, imaginaryPart)
            println(output)
        }
    }

}
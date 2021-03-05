fun main() {
    var a = 10
    val b = 3
    var c = 7

    println("a++ : ${a++}") //10 (11)
    println("++a : ${++a}") //12

    println("a-- : ${a--}") //12 (11)
    println("--a : ${--a}") // 10

    println("a+b = ${a + b}")
    println("a-b = ${a - b}")
    println("a*b = ${a * b}")
    println("a/b = ${a / b}")
    println("a%b = ${a % b}")

    println("2+2*5 = ${2 + 2 * 5}")
    println("(2+2)*5 = ${(2 + 2) * 5}")
    a += 2
    println("a += 2 : $a")
    a -= 2
    println("a -= 2 : $a")
    a *= 2
    println("a *= 2 : $a")
    a /= 2
    println("a /= 2 : $a")
    a %= 2
    println("a %= 2 : $a")

    println("-c : ${-c}")
}

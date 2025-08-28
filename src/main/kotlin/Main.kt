fun main() {
    val numeros = listOf(1, 2, 4, 7, 13, 9, 23)
    val resultado = numeros.map { esPrimo(it) }

    println("IN: $numeros")
    println("OUT: $resultado")
}



fun esPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

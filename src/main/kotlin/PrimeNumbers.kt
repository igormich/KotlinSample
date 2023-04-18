import kotlin.math.sqrt

fun main() {
    testPrime1()
}

fun testPrime1() {
    val primeNumbers = mutableListOf(2, 3)
    for (n in 3 until 100 step 2) {
        val sqrtN = sqrt(n.toFloat()) + 1
        var isPrime = true
        for (i in primeNumbers) {
            if (n % i == 0) {
                isPrime = false
                break
            }
            if (i > sqrtN)
                break
        }
        if(isPrime)
            primeNumbers.add(n)
    }
    println(primeNumbers)
}

fun testPrime2() {
    val primeNumbers = mutableListOf<Int>(2, 3)
    for (n in 3 until 100 step 2) {
        val sqrtN = sqrt(n.toFloat()) + 1
        val isPrime = primeNumbers.takeWhile { it < sqrtN }.all { n % it != 0 }
        if (isPrime) {
            primeNumbers.add(n)
        }
    }
    println(primeNumbers)
}
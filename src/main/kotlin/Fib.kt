fun fib1(n: Int): Int {
    if ((n == 0) || (n == 1)) {
        return 1
    } else {
        return fib1(n - 1) + fib1(n - 2)
    }//TODO: some todo
}

fun fib2(n: Int): Int {
    return if ((n == 0) || (n == 1)) {
        1
    } else {
        fib1(n - 1) + fib1(n - 2)
    }
}

fun fib3(n: Int) = when (n) {
    0, 1 -> 1
    else -> fib1(n - 1) + fib1(n - 2)
}

fun main() {
    for (i in 1..10)
        println(fib3(i))
}
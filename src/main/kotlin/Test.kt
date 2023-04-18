fun main() {
    var name: String?
    do {
        println("Enter name")
        name = readlnOrNull()
    } while (name.isNullOrBlank())
    println("Hello $name")
    println("Length of you name is ${name.length}")
}
fun main() {

    var nullable: String? = null
    var notnull = "ABC"
    nullable = notnull
    println(nullable)
    println(notnull)

    if(nullable!=null) {//nullable?.length
        nullable.length
    }

}
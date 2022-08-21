package kr.mmorris.kotlininaction._9_generics

fun main() {
    val listOf = listOf(1, 2, 3)

    if (listOf is List) {
        println("listOf is List")
    }

    if (listOf is List<*>) {
        println("listOf is List<*>")
    }

    if (listOf is List<Int>) {
        println("listOf is List<Int>")
    }

    printSum(listOf("asd"))
}

fun printSum(c: Collection<String>) {
    if (c is List<String>) {
        println("aaaa")
    }
}

inline fun <reified T> isA(value: Any) = value is T
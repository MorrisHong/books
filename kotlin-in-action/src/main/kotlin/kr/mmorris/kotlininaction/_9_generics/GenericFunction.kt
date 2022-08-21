package kr.mmorris.kotlininaction._9_generics

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
}
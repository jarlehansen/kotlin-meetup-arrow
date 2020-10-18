package net.jarlehansen.arrow

import arrow.core.Either

private fun String.toIntEither(): Either<IllegalArgumentException, Int> =
    Either.conditionally(
        this.matches(Regex("\\d+")),
        { IllegalArgumentException("$this is not a number") },
        this::toInt
    )

fun main() {
    when (val response = "123".toIntEither()) {
        is Either.Left -> println(response.a.message)
        is Either.Right -> println("Number is ${response.b}")
    }
}
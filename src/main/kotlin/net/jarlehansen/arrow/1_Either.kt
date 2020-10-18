package net.jarlehansen.arrow

import arrow.core.Either

private fun String.toIntEither(): Either<IllegalArgumentException, Int> =
    if (this.matches(Regex("\\d+"))) {
        Either.right(this.toInt())
    } else {
        Either.left(IllegalArgumentException("$this is not a number"))
    }

fun main() {
    "123".toIntEither().map {
        println("Number is $it")
    }.mapLeft {
        println(it.message)
    }
}

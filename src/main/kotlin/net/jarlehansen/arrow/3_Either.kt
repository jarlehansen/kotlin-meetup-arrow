package net.jarlehansen.arrow

import arrow.core.Either

private suspend fun String.toIntEither(): Either<Throwable, Int> =
    Either.catch { this.toInt() }

suspend fun main() {
    // fold - Applies ifLeft if this is a Left or ifRight if this is a Right

    "123".toIntEither()
        .fold({"$it is not a number"}, {"Number is $it"})
        .also { println(it) }
}
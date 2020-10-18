package net.jarlehansen.arrow

import arrow.core.Either

private suspend fun String.toIntEither(): Either<Throwable, Int> = Either.catch { this.toInt() }

suspend fun main() {
    "123".toIntEither().map {
        println("Number is $it")
    }.mapLeft {
        println(it)
    }
}
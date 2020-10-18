package net.jarlehansen.arrow

import arrow.fx.coroutines.Duration
import arrow.fx.coroutines.raceN
import arrow.fx.coroutines.sleep
import kotlinx.coroutines.runBlocking
import java.util.Random
import java.util.concurrent.TimeUnit

suspend fun one() = Random().nextInt(4).also {
    sleep(Duration(it.toLong(), TimeUnit.SECONDS))
}

suspend fun two() = Random().nextInt(4).also {
    sleep(Duration(it.toLong(), TimeUnit.SECONDS))
}

fun main() = runBlocking {
    repeat(5) {
        raceN({ one() }, { two() }).map {
            println("right - fun two(): $it")
        }.mapLeft {
            println("left - fun one(): $it")
        }
    }
}

package net.jarlehansen.arrow

import arrow.optics.optics

@optics
data class Person(val name: String, val address: Address) {
    companion object
}

@optics
data class Address(val street: String) {
    companion object
}

fun main() {
    val person = Person("Jarle", Address("Veien 1"))
    println(person)

    val streetLens = Person.address.street
    val upperCase = streetLens.modify(person, String::toUpperCase)
    println(upperCase)
}
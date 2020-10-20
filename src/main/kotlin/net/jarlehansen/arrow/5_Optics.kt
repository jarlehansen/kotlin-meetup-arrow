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

// Lenses can be generated for a data class by the @optics annotation.
// For every constructor parameter of the data class, a Lens will be generated.
// The lenses will be generated as extension properties on the companion object val T.Companion.paramName.

fun main() {
    val person = Person("Jarle", Address("Veien 1"))
    println(person)

    val streetLens = Person.address.street
    val upperCase = streetLens.modify(person, String::toUpperCase)
    println(upperCase)
}
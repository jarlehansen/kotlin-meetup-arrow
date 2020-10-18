package `net`.`jarlehansen`.`arrow`

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val `net`.`jarlehansen`.`arrow`.`Address`.Companion.iso: arrow.optics.Iso<`net`.`jarlehansen`.`arrow`.`Address`, `kotlin`.`String`> inline get()= arrow.optics.Iso(
  get = { address: `net`.`jarlehansen`.`arrow`.`Address` -> address.street },
  reverseGet = { `net`.`jarlehansen`.`arrow`.`Address`(it) }
)

inline val `net`.`jarlehansen`.`arrow`.`Address`.Companion.street: arrow.optics.Lens<`net`.`jarlehansen`.`arrow`.`Address`, `kotlin`.`String`> inline get()= arrow.optics.Lens(
  get = { address: `net`.`jarlehansen`.`arrow`.`Address` -> address.`street` },
  set = { address: `net`.`jarlehansen`.`arrow`.`Address`, value: `kotlin`.`String` -> address.copy(`street` = value) }
)



inline val <S> arrow.optics.Iso<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Lens<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Lens<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Lens<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Optional<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Optional<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Prism<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Optional<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Getter<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Getter<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Setter<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Setter<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Traversal<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Traversal<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street
inline val <S> arrow.optics.Fold<S, `net`.`jarlehansen`.`arrow`.`Address`>.street: arrow.optics.Fold<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Address`.street

package `net`.`jarlehansen`.`arrow`

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val `net`.`jarlehansen`.`arrow`.`Person`.Companion.iso: arrow.optics.Iso<`net`.`jarlehansen`.`arrow`.`Person`, arrow.core.Tuple2<`kotlin`.`String`, `net`.`jarlehansen`.`arrow`.`Address`>> inline get()= arrow.optics.Iso(
  get = { person: `net`.`jarlehansen`.`arrow`.`Person` -> arrow.core.Tuple2(person.`name`, person.`address`) },
  reverseGet = { tuple: arrow.core.Tuple2<`kotlin`.`String`, `net`.`jarlehansen`.`arrow`.`Address`> -> `net`.`jarlehansen`.`arrow`.`Person`(tuple.a, tuple.b) }
)

inline val `net`.`jarlehansen`.`arrow`.`Person`.Companion.name: arrow.optics.Lens<`net`.`jarlehansen`.`arrow`.`Person`, `kotlin`.`String`> inline get()= arrow.optics.Lens(
  get = { person: `net`.`jarlehansen`.`arrow`.`Person` -> person.`name` },
  set = { person: `net`.`jarlehansen`.`arrow`.`Person`, value: `kotlin`.`String` -> person.copy(`name` = value) }
)

inline val `net`.`jarlehansen`.`arrow`.`Person`.Companion.address: arrow.optics.Lens<`net`.`jarlehansen`.`arrow`.`Person`, `net`.`jarlehansen`.`arrow`.`Address`> inline get()= arrow.optics.Lens(
  get = { person: `net`.`jarlehansen`.`arrow`.`Person` -> person.`address` },
  set = { person: `net`.`jarlehansen`.`arrow`.`Person`, value: `net`.`jarlehansen`.`arrow`.`Address` -> person.copy(`address` = value) }
)




inline val <S> arrow.optics.Iso<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Lens<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Lens<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Lens<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Optional<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Optional<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Prism<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Optional<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Getter<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Getter<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Setter<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Setter<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Traversal<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Traversal<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name
inline val <S> arrow.optics.Fold<S, `net`.`jarlehansen`.`arrow`.`Person`>.name: arrow.optics.Fold<S, `kotlin`.`String`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.name

inline val <S> arrow.optics.Iso<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Lens<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Lens<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Lens<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Optional<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Optional<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Prism<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Optional<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Getter<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Getter<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Setter<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Setter<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Traversal<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Traversal<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address
inline val <S> arrow.optics.Fold<S, `net`.`jarlehansen`.`arrow`.`Person`>.address: arrow.optics.Fold<S, `net`.`jarlehansen`.`arrow`.`Address`> inline get() = this + `net`.`jarlehansen`.`arrow`.`Person`.address

package nano

import scala.language.strictEquality
import scala.collection.mutable

opaque type MAC = String
type MACError = String

object MAC:
  def apply(mac: String): Either[MACError, MAC] =
    Either.cond(
      mac.length == 12,
      mac,
      s"MAC length must be 12, not ${mac.length}."
    )

given CanEqual[MAC, MAC] = CanEqual.derived

extension (mac: MAC)
  def address: String = mac
  def display: String =
    val colon = ':'
    val chars = mac.toArray
    val address = mutable.StringBuilder()
    address.append(chars(0)).append(chars(1)).append(colon)
    address.append(chars(2)).append(chars(3)).append(colon)
    address.append(chars(4)).append(chars(5)).append(colon)
    address.append(chars(6)).append(chars(7)).append(colon)
    address.append(chars(8)).append(chars(9)).append(colon)
    address.append(chars(10)).append(chars(11))
    address.toString
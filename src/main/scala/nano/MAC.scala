package nano

import java.lang.Integer

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
    val builder = mutable.StringBuilder()
    builder += chars(0) += chars(1) += colon
    builder += chars(2) += chars(3) += colon
    builder += chars(4) += chars(5) += colon
    builder += chars(6) += chars(7) += colon
    builder += chars(8) += chars(9) += colon
    builder += chars(10) += chars(11)
    builder.toString
  def number: Long =
    val chars = mac.toArray
    val builder = mutable.ArrayBuffer[Long]()
    builder += Integer.parseInt( s"${chars(0)}${chars(1)}", 16)
    builder += Integer.parseInt( s"${chars(2)}${chars(3)}", 16)
    builder += Integer.parseInt( s"${chars(4)}${chars(5)}", 16)
    builder += Integer.parseInt( s"${chars(6)}${chars(7)}", 16)
    builder += Integer.parseInt( s"${chars(8)}${chars(9)}", 16)
    builder += Integer.parseInt( s"${chars(10)}${chars(11)}", 16)
    builder.sum
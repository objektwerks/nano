package nano

import scala.language.strictEquality

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
package nano

import scala.language.strictEquality

opaque type MAC = String

object MAC:
  def apply(mac: String): MAC = mac

given CanEqual[MAC, MAC] = CanEqual.derived

extension (mac: MAC)
  def address: String = mac
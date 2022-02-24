package nano

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MACTest extends AnyFunSuite with Matchers:
  private val address = "50ed3c45f4ba"

  test("valid mac") {
    MAC(address).foreach(a => a shouldBe address)
  }

  test("invalid mac") {
    MAC("1a2b3c").foreach(a => a shouldBe "")
  }

  test("display mac") {
    MAC(address).foreach(a => a.display shouldBe "50:ed:3c:45:f4:ba")
  }

  test("number mac") {
    MAC(address).foreach(a => a.number shouldBe 1011217594)
    println( "CAFE".toLowerCase.toList.map(MAC.hexChars.indexOf(_)).reduce(_ * 16 + _) )
    println( address.toLowerCase.toList.map(MAC.hexChars.indexOf(_)).reduce(_ * 16 + _) )
  }
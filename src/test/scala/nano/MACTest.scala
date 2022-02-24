package nano

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MACTest extends AnyFunSuite with Matchers:
  private val address = "50ed3c45f4ba"

  test("valid mac") {
    val mac = MAC(address)
    mac.isRight shouldBe true
    mac.foreach(a => a shouldBe address)
  }

  test("invalid mac") {
    val mac = MAC("1a2b3c")
    mac.isLeft shouldBe true
    mac.foreach(a => a shouldBe "")
  }

  test("display mac") {
    val mac = MAC(address)
    mac.foreach(a => a.display shouldBe "50:ed:3c:45:f4:ba")
  }

  test("number mac") {
    val mac = MAC(address)
    mac.foreach(a => a.number shouldBe 876)
  }
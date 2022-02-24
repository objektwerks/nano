package nano

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MACTest extends AnyFunSuite with Matchers:
  test("valid mac") {
    val address = "1a2b3c4d5e6f"
    val mac = MAC(address)
    mac.isRight shouldBe true
    mac.foreach(a => a shouldBe address)
  }

  test("invalid mac") {
    val mac = MAC("1a2b3c")
    mac.isLeft shouldBe true
    mac.foreach(a => a shouldBe "")
  }
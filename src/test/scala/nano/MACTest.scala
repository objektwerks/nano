package nano

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MACTest extends AnyFunSuite with Matchers:
  private val address = "1a2b3c4d5e6f"

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
    mac.foreach(a => a.display shouldBe "1a:2b:3c:4d:5e:6f")
  }

  test("number mac") {
    val mac = MAC(address)
    mac.foreach(a => a.number shouldBe 411)
    mac.foreach(a => println(a.number))
  }
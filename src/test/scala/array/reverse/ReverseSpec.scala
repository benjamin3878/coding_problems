package array.reverse

import org.scalatest.{Matchers, WordSpec}

class ReverseSpec extends WordSpec with Matchers {

  "Reverse" should {
    "return the original array of size 1" in {
      Reverse(Array(0)) shouldBe Array(0)
    }
    "reverse an array" in {
      Reverse(Array(1,2,3)) shouldBe Array(3,2,1)
    }
  }
}

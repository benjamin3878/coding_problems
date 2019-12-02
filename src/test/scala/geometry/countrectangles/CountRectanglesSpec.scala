package geometry.countrectangles

import org.scalatest.{Matchers, WordSpec}

class CountRectanglesSpec extends WordSpec with Matchers {

  val unitVector = Set((0,0), (0,1), (1,0), (1,1))
  val scaledUnitVector = Set((0,0), (0,2), (2,0), (2,2))
  val threeByThree = (0 to 2).flatMap(x=> (0 to 2).map(y => (x,y))).toSet

  "CountRectangles" should {
    "return 1 for a unit vector case" in {
      CountRectangles(unitVector) shouldBe 1
    }
    "return 1 for a scaled unit vector case" in {
      CountRectangles(scaledUnitVector) shouldBe 1
    }
    "return 9 for a 3 by 3 case" in {
      CountRectangles(threeByThree) shouldBe 9
    }
    "return 3 for scaled plus points at (1,0) and (1,2)" in {
      CountRectangles(scaledUnitVector + (1 -> 0) + (1 -> 2) ) shouldBe 3
    }
  }

}

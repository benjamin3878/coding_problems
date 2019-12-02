package geometry.countrectangles

object CountRectangles {

  /**
    * (x,y)(x,y1)(x1,y)(x1,y1)
    *
    * @param points
    * @return
    */
  def apply(points: Set[(Int, Int)]): Int = {
    // 1. find all vertical lines
    // 2. check against others, only looking up and right

    val verticalLines = for {
      (x,y) <- points
      verticalLines <- points.filter { case (x1, y1) => x == x1 && y1 > y }
    } yield { (x, y) -> verticalLines }

    verticalLines.foldLeft(0) { case (acc, ((x, y), (x2, y2))) =>
      acc + verticalLines.count { case (p1, p2) =>  p1._1 > x && p1._2 == y && p2._2 == y2 }
    }
  }
}

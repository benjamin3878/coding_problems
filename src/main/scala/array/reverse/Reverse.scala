package array.reverse

object Reverse {

  def apply[A](arr: Array[A]): Array[A] = {
    var i = 0
    while (i < arr.length / 2) {
      val temp = arr(i)
      arr(i) = arr(arr.length - i - 1)
      arr(arr.length - i - 1) = temp
      i += 1
    }

    arr
  }
}

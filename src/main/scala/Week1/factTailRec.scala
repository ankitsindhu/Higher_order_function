package Week1

/**
  * Created by ankit on 10/3/17.
  */
object factTailRec extends App{

  def fact(n: Int): Int = {
    def factTail(temp: Int, n: Int): Int =
      if (n == 0) temp else factTail(temp * n, n - 1)

    factTail(1, n)
  }
print(fact(6))
}

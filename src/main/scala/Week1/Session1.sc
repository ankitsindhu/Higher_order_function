
//1. Find AND and OR through functions without && or || operators
 /* def and(x:Boolean,y:Boolean)=
    if(x) y else false
  and(true,false)
  and(false,true)
  and(true,true)
  and(false,false)

  def or(x:Boolean,y:Boolean)=
  if(!x) y else true

  or(true,false)
  or(false,true)
  or(true,true)
  or(false,false)*/

//2. Finding sqrt of a number
/*def sqrt(x:Double) = {
  def sqrtItr(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else
      sqrtItr(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    Math.abs(guess * guess - x) / x < 0.0000000001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  sqrtItr(1.0,x)
}*/

//sqrt(36)

//3. sum of integers b/w two numbers
/*def sum(a:Int, b:Int):Int=
if(a>b) 0 else a + sum(a+1,b)*/

//sum(2,8)

//4. sum of cube of numbers b/w two numbers
/*
def cube(a:Int):Int= a*a*a
def sumCubes(a:Int,b:Int):Int=
if(a>b) 0 else cube(a)+sumCubes(a+1,b)
*/

//sumCubes(2,4)

//5. Factorial using tail recursion

  /*def fact(n: Int): Int = {
    def factTail(temp: Int, n: Int): Int =
      if (n == 0) temp else factTail(temp * n,  - 1)

    factTail(1, n)
  }
  fact(6)*/




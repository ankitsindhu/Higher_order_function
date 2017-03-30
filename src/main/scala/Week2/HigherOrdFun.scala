package Week2

/**
  * Created by ankit on 10/3/17.
  */
object HigherOrdFun extends App{
  def sumCubes(f:Int => Int, a:Int, b:Int):Int={
    if(a>b) 0
    else
      f(a)+sumCubes(f,a+1,b)
       }
  def cube(a:Int):Int=a*a*a
  println("sum of cubes with higher function="+sumCubes(cube,2,3))

  /*def sumAnonymous(f:Int=>Int,x:Int,y:Int)={
    def loop(x:Int,acc:Int):Int=
      if(x>y) acc
      else loop(x+1,f(x)+acc)
    loop(x,0)
  }
  println("sum of squares with anonymous function="+sumAnonymous(x=>x*x,2,4))*/

}

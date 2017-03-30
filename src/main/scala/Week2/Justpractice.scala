package Week2

/**
  * Created by ankit on 14/3/17.
  */
object Justpractice extends App{
 def sum(f:Int => Int, x:Int, y:Int)={
  def loop(a:Int,b:Int):Int=
   if(a>y) b
  else
    loop(a+1, f(a)+b)
  loop(x,0)
 }
 def cube(x:Int)=x*x*x
println("sum with cube is ="+sum(cube,1,4))
 println("sum with square is ="+sum(x=>x*x,1,4))

 def sumcubes(a:Int,b:Int)=sum(cube,a,b)
 println("new one= "+sumcubes(2,4))
}

#Find Maximum No from Four Nos:

import scala.io.StdIn.{readInt}
object Ass3
{
def main(args:Array[String])
{
println("Enter no.of values")
var n:Int=readInt()
var arr:Array[Int]=new Array(n)


println("Enter values:")
for(i<-0 to arr.length-1)
arr(i)=readInt()
var max:Int=arr(0)
for(i<-1 ro arr.length-1)
if(arr(i)>max) max=arr(i)
println("Maximum="+max)
}
}


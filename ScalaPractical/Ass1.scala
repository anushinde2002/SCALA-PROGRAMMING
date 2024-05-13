import scala.io.StdIn.{readInt}
object Ass1
{
def main(args:Array[String])
{
println("Enter n1 and n2")
var n1:Int=readInt()
var n2:Int=readInt()
if(n1>n2)
{
var temp=n1
n1=n2
n2=temp
}
var sum:Int=0
for(i<-n1 to n2)
sum=sum+i
println("sum=",+sum)
var n=n2-n1+1
var avg:float=(sum).to float /n
println("Average="+avg)
}
}

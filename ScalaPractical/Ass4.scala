import scala.io.StdIn.{readInt}
object Ass4{
    def sumNumber(n:Int):Int=
        {
            var sum:Int=0
            //for(i<-1 to n)
            //sum=sum+i
            sum=(n*(n+1))/2
            return sum
        }
        def main(args:Array[String])
        {
            println("Enter n:")
            var n:Int=readInt()
            printf("sum=%d",sumNumber(n))
        }
}
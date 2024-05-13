import scala.io.stdIn.{readInt}
object Ass6
{
    def decimalToBinary(n:Int):Unit=
        {
            if(n!=0)
            {
                decimalToBinary(n/2)
                printf("%d",n%2)
            }
        }
        def main(args:Array[String])
        {
            println("Enter n:")
            var n:Int=readInt()
            decimalToBinary(n)
        }
}

import scala.io.stdIn.{readInt}
object Ass7
{
    def decimalToBinary(n:Int):Unit=
        {
            if(n!=0)
            {
                decimalToOctal(n/8)
                printf("%d",n%8)
            }
        }
        def main(args:Array[String])
        {
            println("Enter n:")
            var n:Int=readInt()
            decimalToOctal(n)
        }
}

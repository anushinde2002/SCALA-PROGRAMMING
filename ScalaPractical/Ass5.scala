import scala.io.stdIn.{readInt}
object Ass5{
    def checkPrime(n:Int):Boolean=
        {
            if(n==2 || n==3)
               return true
            if(n%2==0)
               return false
            for(i<-3 to n/2 by 2)
            {
                if(n%i==0)
                   return false

            }
            return true

        }
        def main(args:Array[String])
        {
            println("Enter n:")
            var n:Int=readInt()
            var rand=new scala.util.Random
            for(i<-1 to n)
            {
                var num=rand.nextInt(100)
                if(checkPrime(num))
                   println(num+"is prime number")
                else
                    println(num+"is not prime number")
            }
        }

}

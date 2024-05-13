#Armstrong Number

import scala.math.pow

object ArmstrongNumberChecker {
  def isArmstrongNumber(number: Int): Boolean = {
    // Convert the number to a string to count the number of digits
    val numStr = number.toString
    val numDigits = numStr.length

    // Calculate the sum of digits raised to the power of the number of digits
    val sum = numStr.map(digit => pow(digit.asDigit, numDigits)).sum.toInt

    // Check if the sum is equal to the original number
    number == sum
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val inputNumber = scala.io.StdIn.readInt()

    if (isArmstrongNumber(inputNumber)) {
      println(s"$inputNumber is an Armstrong number.")
    } else {
      println(s"$inputNumber is not an Armstrong number.")
    }
  }
}

import scala.io.StdIn

object MatrixAddition {
  def main(args: Array[String]): Unit = {
    // Accept the dimensions of the matrices from the user
    print("Enter the number of rows: ")
    val numRows = StdIn.readInt()
    print("Enter the number of columns: ")
    val numCols = StdIn.readInt()

    // Initialize two empty matrices with the given dimensions
    val matrix1 = Array.ofDim[Int](numRows, numCols)
    val matrix2 = Array.ofDim[Int](numRows, numCols)

    // Accept matrix elements for the first matrix
    println(s"Enter elements for the first matrix ($numRows x $numCols):")
    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        print(s"Matrix1($i, $j): ")
        matrix1(i)(j) = StdIn.readInt()
      }
    }

    // Accept matrix elements for the second matrix
    println(s"Enter elements for the second matrix ($numRows x $numCols):")
    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        print(s"Matrix2($i, $j): ")
        matrix2(i)(j) = StdIn.readInt()
      }
    }

    // Initialize a matrix to store the result of addition
    val resultMatrix = Array.ofDim[Int](numRows, numCols)

    // Perform matrix addition
    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        resultMatrix(i)(j) = matrix1(i)(j) + matrix2(i)(j)
      }
    }

    // Display the result matrix
    println("Result of Matrix Addition:")
    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        print(resultMatrix(i)(j) + "\t")
      }
      println()
    }
  }
}

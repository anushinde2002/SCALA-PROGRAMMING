import scala.io.StdIn

object MatrixTranspose {
  def main(args: Array[String]): Unit = {
    // Accept the dimensions of the matrix from the user
    print("Enter the number of rows: ")
    val numRows = StdIn.readInt()
    print("Enter the number of columns: ")
    val numCols = StdIn.readInt()

    // Initialize an empty matrix with the given dimensions
    val matrix = Array.ofDim[Int](numRows, numCols)

    // Accept matrix elements from the user
    println(s"Enter the matrix elements ($numRows x $numCols):")
    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        print(s"Matrix($i, $j): ")
        matrix(i)(j) = StdIn.readInt()
      }
    }

    // Display the original matrix
    println("Original Matrix:")
    for (i <- 0 until numRows) {
      for (j <- 0 until numCols) {
        print(matrix(i)(j) + "\t")
      }
      println()
    }

    // Calculate and display the transpose of the matrix
    println("Transpose Matrix:")
    for (j <- 0 until numCols) {
      for (i <- 0 until numRows) {
        print(matrix(i)(j) + "\t")
      }
      println()
    }
  }
}

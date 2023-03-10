/*The given program checks the number of elements between two numbers(inputted by user)
* which are divisble by the third number(inputted by the user)
*                                                       -Ayush Pathak */
import scala.io.StdIn
object CountDivisors {
  def main(commandLineArguments : Array[String]):
  Unit=
    {
      println("Enter the value of lowerlimit , upperlimit and the divisor")
      val lowerLimitNumber=StdIn.readInt()
      val upperLimitNumber=StdIn.readInt()
      val divisor=StdIn.readInt()
      val numberOfDivisors=calculateNumberOfDvisors(lowerLimitNumber,upperLimitNumber,divisor)
      println(s"Number of Divisors are : $numberOfDivisors")
    }
  def calculateNumberOfDvisors(lowerNumber :Int , upperNumber :Int , divisor : Int):
  Int={
    var countingDivisors=0
    for(index<- lowerNumber to upperNumber)
      {
        if(index % divisor == 0)
          {
            countingDivisors=countingDivisors+1
          }
      }
    countingDivisors
  }
}
